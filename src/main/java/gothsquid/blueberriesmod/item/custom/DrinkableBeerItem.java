package gothsquid.blueberriesmod.item.custom;

import gothsquid.blueberriesmod.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class DrinkableBeerItem extends Item {
    public DrinkableBeerItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 32;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);
        return TypedActionResult.consume(user.getStackInHand(hand));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            // Play drinking sound
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.ENTITY_GENERIC_DRINK, SoundCategory.PLAYERS, 1.0F, 1.0F);

            ItemStack resultStack = super.finishUsing(stack, world, entity);

            if (!player.getAbilities().creativeMode) {
                ItemStack emptyBeerGlass = new ItemStack(ModItems.BEER_GLASS);
                if (!player.getInventory().insertStack(emptyBeerGlass)) {
                    player.dropItem(emptyBeerGlass, false);
                }
            }

            return resultStack;
        }
        return super.finishUsing(stack, world, entity);
    }
}
