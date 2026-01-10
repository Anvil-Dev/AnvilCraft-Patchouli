package dev.anvilcraft.patchouli.page.anvilitem;

import dev.dubhe.anvilcraft.init.block.ModBlocks;
import dev.dubhe.anvilcraft.init.recipe.ModRecipeTypes;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.NeutronIrradiationRecipe;
import net.minecraft.world.level.block.Blocks;

public class PageNeutronIrradiation extends PageAnvilItemProcess<NeutronIrradiationRecipe> {
    public PageNeutronIrradiation() {
        super(
            ModRecipeTypes.NEUTRON_IRRADIATION.get(),
            NeutronIrradiationRecipe::getInputItems,
            NeutronIrradiationRecipe::getResultItems,
            recipe -> Blocks.CAULDRON.defaultBlockState(),
            recipe -> ModBlocks.NEUTRON_IRRADIATOR.getDefaultState()
        );
    }
}
