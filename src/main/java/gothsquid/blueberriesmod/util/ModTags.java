package gothsquid.blueberriesmod.util;

import gothsquid.blueberriesmod.BlueberriesMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_STAR_GARNET_TOOL = createTag("needs_star_garnet_tool");
        public static final TagKey<Block> INCORRECT_FOR_STAR_GARNET_TOOL = createTag("incorrect_for_star_garnet_tool");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BlueberriesMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(BlueberriesMod.MOD_ID, name));
        }
    }
}
