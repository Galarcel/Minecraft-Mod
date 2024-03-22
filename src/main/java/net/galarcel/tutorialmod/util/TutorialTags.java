package net.galarcel.tutorialmod.util;

import net.galarcel.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class TutorialTags {
    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> FIRESTONE_CLICKABLE_BLOCKS =
                createTag("firestone_clickable_blocks");


        // creates a tag for our tutorial mod ID namespace
        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(TutorialMod.MOD_ID, name));
        }
        // create a tag under the forge namespace
        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        // creates a tag for our tutorial mod ID namespace
        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(TutorialMod.MOD_ID, name));
        }
        // create a tag under the forge namespace
        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
