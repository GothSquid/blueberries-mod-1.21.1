package gothsquid.blueberriesmod.block.entity;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.block.entity.custom.KegBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<KegBlockEntity> KEG_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(BlueberriesMod.MOD_ID, "keg_be"),
                    BlockEntityType.Builder.create(KegBlockEntity::new, ModBlocks.KEG).build(null));

    public static void registerBlockEntities() {
        BlueberriesMod.LOGGER.info("Registering Block Entities for " + BlueberriesMod.MOD_ID);
    }
}
