package dev.anvilcraft.patchouli.client;

import dev.anvilcraft.patchouli.AnvilCraftPatchouli;
import dev.anvilcraft.patchouli.page.PageAnvilCollisionCraft;
import dev.anvilcraft.patchouli.page.PageBlockCompress;
import dev.anvilcraft.patchouli.page.PageItemInject;
import dev.anvilcraft.patchouli.page.PageJewelCrafting;
import dev.anvilcraft.patchouli.page.PageMesh;
import dev.anvilcraft.patchouli.page.PageMultipleToOneSmithing;
import dev.anvilcraft.patchouli.page.anvilitem.PageBoiling;
import dev.anvilcraft.patchouli.page.anvilitem.PageBulging;
import dev.anvilcraft.patchouli.page.anvilitem.PageCooking;
import dev.anvilcraft.patchouli.page.anvilitem.PageItemCompress;
import dev.anvilcraft.patchouli.page.anvilitem.PageItemCrush;
import dev.anvilcraft.patchouli.page.anvilitem.PageNeutronIrradiation;
import dev.anvilcraft.patchouli.page.anvilitem.PageStamping;
import dev.anvilcraft.patchouli.page.anvilitem.PageSuperHeating;
import dev.anvilcraft.patchouli.page.anvilitem.PageTimeWarp;
import dev.anvilcraft.patchouli.page.anvilitem.PageUnpack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import vazkii.patchouli.client.book.ClientBookRegistry;

@Mod(value = AnvilCraftPatchouli.MOD_ID, dist = Dist.CLIENT)
public class AnvilCraftPatchouliClient {
    public AnvilCraftPatchouliClient(@SuppressWarnings("unused") @NotNull IEventBus modBus, @SuppressWarnings("unused") @NotNull ModContainer container) {
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("time_warp"), PageTimeWarp.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("neutron_irradiation"), PageNeutronIrradiation.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("super_heating"), PageSuperHeating.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("jewel_crafting"), PageJewelCrafting.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("multiple_to_one_smithing"), PageMultipleToOneSmithing.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("block_compress"), PageBlockCompress.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("item_inject"), PageItemInject.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("item_crush"), PageItemCrush.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("item_compress"), PageItemCompress.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("stamping"), PageStamping.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("bulging"), PageBulging.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("boiling"), PageBoiling.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("cooking"), PageCooking.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("unpack"), PageUnpack.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("mesh"), PageMesh.class);
        ClientBookRegistry.INSTANCE.pageTypes.put(AnvilCraftPatchouli.of("anvil_collision"), PageAnvilCollisionCraft.class);
    }
}
