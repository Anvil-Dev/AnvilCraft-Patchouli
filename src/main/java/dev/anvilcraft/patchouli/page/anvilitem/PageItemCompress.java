package dev.anvilcraft.patchouli.page.anvilitem;

import dev.dubhe.anvilcraft.init.recipe.ModRecipeTypes;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.ItemCompressRecipe;
import net.minecraft.world.level.block.Blocks;

public class PageItemCompress extends PageAnvilItemProcess<ItemCompressRecipe> {
    public PageItemCompress() {
        super(
            ModRecipeTypes.ITEM_COMPRESS_TYPE.get(),
            ItemCompressRecipe::getInputItems,
            ItemCompressRecipe::getResultItems,
            recipe -> Blocks.CAULDRON.defaultBlockState(),
            null
        );
    }
}
