package gothsquid.blueberriesmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class MerlinsMeadItem extends DrinkableBeerItem{
    public MerlinsMeadItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof LivingEntity) {
            ServerWorld serverWorld = (ServerWorld) world;

            for (int i = 0; i < 40; i++) {
                double offsetX = (world.random.nextDouble() - 0.5) * 1.5;
                double offsetY = world.random.nextDouble() * 1.5;
                double offsetZ = (world.random.nextDouble() - 0.5) * 1.5;

                serverWorld.spawnParticles(ParticleTypes.PORTAL,
                        user.getX() + offsetX,
                        user.getY() + offsetY,
                        user.getZ() + offsetZ,
                        1, 0, 0, 0, 0);

                serverWorld.spawnParticles(ParticleTypes.ENCHANT,
                        user.getX(),
                        user.getY() + 1.0,
                        user.getZ(),
                        2, 0.3, 0.3, 0.3, 0.0);

                serverWorld.spawnParticles(ParticleTypes.REVERSE_PORTAL,
                        user.getX(),
                        user.getY() + 0.5,
                        user.getZ(),
                        1, 0.2, 0.2, 0.2, 0.01);
            }
        }

        return result;
    }
}
