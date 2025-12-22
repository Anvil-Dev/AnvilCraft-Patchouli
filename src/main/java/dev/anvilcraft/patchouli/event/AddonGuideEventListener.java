package dev.anvilcraft.patchouli.event;

import dev.anvilcraft.patchouli.AnvilCraftPatchouli;
import dev.anvilcraft.patchouli.util.PatchouliUtil;
import dev.dubhe.anvilcraft.api.event.GuideBookEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = AnvilCraftPatchouli.MOD_ID)
public class AddonGuideEventListener {
    @SubscribeEvent
    public static void onHasGuide(GuideBookEvent.HasGuideBookEvent event) {
        event.hasGuideBook();
    }

    @SubscribeEvent
    public static void onOpenGuide(GuideBookEvent.OpenGuideBookEvent event) {
        PatchouliUtil.openBook(event.getPlayer());
    }
}
