package gothsquid.blueberriesmod.datagen;

import gothsquid.blueberriesmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.BLUEBERRY_BOW);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.STAR_GARNET_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.STAR_GARNET_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.STAR_GARNET_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.STAR_GARNET_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.STAR_GARNET_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.STAR_GARNET_HELMET)
                .add(ModItems.STAR_GARNET_CHESTPLATE)
                .add(ModItems.STAR_GARNET_LEGGINGS)
                .add(ModItems.STAR_GARNET_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.STAR_GARNET_HELMET)
                .add(ModItems.STAR_GARNET_CHESTPLATE)
                .add(ModItems.STAR_GARNET_LEGGINGS)
                .add(ModItems.STAR_GARNET_BOOTS);
    }
}