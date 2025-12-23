package dev.anvilcraft.patchouli.event;

import dev.anvilcraft.patchouli.AnvilCraftPatchouli;
import dev.anvilcraft.patchouli.util.PatchouliUtil;
import dev.dubhe.anvilcraft.api.event.CheckIntegrationLoadedEvent;
import dev.dubhe.anvilcraft.api.event.GuideBookEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import vazkii.patchouli.api.PatchouliAPI;

@EventBusSubscriber(modid = AnvilCraftPatchouli.MOD_ID)
public class AddonGuideEventListener {
    @SubscribeEvent
    public static void onHasGuide(GuideBookEvent.HasGuideBookEvent event) {
        event.hasGuideBook();
    }

    @SubscribeEvent
    public static void onHasGuide(CheckIntegrationLoadedEvent event) {
        if (event.getId().equals(PatchouliAPI.MOD_ID)) {
            event.setLoaded();
        }
    }

    @SubscribeEvent
    public static void onOpenGuide(GuideBookEvent.OpenGuideBookEvent event) {
        PatchouliUtil.openBook(event.getPlayer());
    }
}
