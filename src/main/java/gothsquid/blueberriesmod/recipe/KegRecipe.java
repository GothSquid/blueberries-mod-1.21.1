package gothsquid.blueberriesmod.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public record KegRecipe(List<Ingredient> ingredients, ItemStack output) implements Recipe<KegRecipeInput> {

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        return DefaultedList.copyOf(Ingredient.EMPTY, ingredients.toArray(new Ingredient[0]));
    }

    @Override
    public boolean matches(KegRecipeInput input, World world) {
        if (world.isClient()) return false;

        if (!ingredients.get(0).test(input.getStackInSlot(0))) {
            return false;
        }

        List<Ingredient> required = ingredients.subList(1, ingredients.size());

        List<ItemStack> inputStacks = new ArrayList<>();
        for (int i = 1; i < input.getSize(); i++) {
            ItemStack stack = input.getStackInSlot(i);
            if (!stack.isEmpty()) inputStacks.add(stack);
        }

        if (inputStacks.size() != required.size()) {
            return false;
        }

        for (Ingredient ingredient : required) {
            boolean matched = false;
            for (int i = 0; i < inputStacks.size(); i++) {
                if (ingredient.test(inputStacks.get(i))) {
                    inputStacks.remove(i);
                    matched = true;
                    break;
                }
            }
            if (!matched) return false;
        }

        return true;
    }

    @Override
    public ItemStack craft(KegRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.KEG_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.KEG_TYPE;
    }

    public static class Serializer implements RecipeSerializer<KegRecipe> {

        public static final MapCodec<KegRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.listOf().fieldOf("ingredients").forGetter(KegRecipe::ingredients),
                ItemStack.CODEC.fieldOf("result").forGetter(KegRecipe::output)
        ).apply(inst, KegRecipe::new));

        private static final PacketCodec<RegistryByteBuf, List<Ingredient>> INGREDIENT_LIST_CODEC =
                PacketCodec.ofStatic(
                        (buf, list) -> {
                            buf.writeVarInt(list.size());
                            for (Ingredient ingredient : list) {
                                Ingredient.PACKET_CODEC.encode(buf, ingredient);
                            }
                        },
                        buf -> {
                            int size = buf.readVarInt();
                            List<Ingredient> list = new ArrayList<>(size);
                            for (int i = 0; i < size; i++) {
                                list.add(Ingredient.PACKET_CODEC.decode(buf));
                            }
                            return list;
                        }
                );

        public static final PacketCodec<RegistryByteBuf, KegRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        INGREDIENT_LIST_CODEC, KegRecipe::ingredients,
                        ItemStack.PACKET_CODEC, KegRecipe::output,
                        KegRecipe::new
                );

        @Override
        public MapCodec<KegRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, KegRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
