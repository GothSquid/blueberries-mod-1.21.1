package gothsquid.blueberriesmod.item.custom;

import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PearlPilsnerItem extends DrinkableBeerItem {
    public PearlPilsnerItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof ServerPlayerEntity player) {
            ServerWorld targetWorld = player.getServerWorld();
            BlockPos targetPos = null;

            // Attempt to use player's personal spawn point (bed or respawn anchor)
            BlockPos spawnPos = player.getSpawnPointPosition();
            if (spawnPos != null && player.getSpawnPointDimension() != null) {
                ServerWorld spawnWorld = player.getServer().getWorld(player.getSpawnPointDimension());

                if (spawnWorld != null) {
                    Block block = spawnWorld.getBlockState(spawnPos).getBlock();

                    // Check if the block is still a valid respawn point (bed or respawn anchor)
                    if (block instanceof BedBlock || block instanceof RespawnAnchorBlock) {
                        targetWorld = spawnWorld;
                        targetPos = spawnPos;
                    }
                }
            }

            // Fallback to Overworld spawn if bed/anchor is missing or invalid
            if (targetPos == null) {
                targetWorld = player.getServer().getOverworld();
                targetPos = targetWorld.getSpawnPos();
            }

            // Teleport the player
            if (targetWorld != null && targetPos != null) {
                Vec3d teleportPos = new Vec3d(
                        targetPos.getX() + 0.5,
                        targetPos.getY() + 1,
                        targetPos.getZ() + 0.5
                );

                player.teleport(targetWorld, teleportPos.x, teleportPos.y, teleportPos.z, player.getYaw(), player.getPitch());

                targetWorld.playSound(null, BlockPos.ofFloored(teleportPos), SoundEvents.ENTITY_ENDERMAN_TELEPORT, player.getSoundCategory(), 1.0f, 1.0f);

                targetWorld.spawnParticles(ParticleTypes.PORTAL, teleportPos.x, teleportPos.y, teleportPos.z, 50, 0.5, 1.0, 0.5, 0.2);
                targetWorld.spawnParticles(ParticleTypes.END_ROD, teleportPos.x, teleportPos.y + 0.5, teleportPos.z, 30, 0.3, 0.6, 0.3, 0.05);
                targetWorld.spawnParticles(ParticleTypes.DRAGON_BREATH, teleportPos.x, teleportPos.y + 0.2, teleportPos.z, 15, 0.4, 0.4, 0.4, 0.1);
                targetWorld.spawnParticles(ParticleTypes.CLOUD, teleportPos.x, teleportPos.y + 0.1, teleportPos.z, 8, 0.3, 0.1, 0.3, 0.01);
            }
        }

        return result;
    }
}
