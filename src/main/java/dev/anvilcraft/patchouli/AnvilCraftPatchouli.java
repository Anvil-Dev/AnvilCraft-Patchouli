package dev.anvilcraft.patchouli;

import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import dev.anvilcraft.patchouli.data.AddonDatagen;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(AnvilCraftPatchouli.MOD_ID)
public class AnvilCraftPatchouli {
    public static final String MOD_ID = "anvilcraft_patchouli";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final Registrate REGISTRATE = Registrate.create(MOD_ID);

    public AnvilCraftPatchouli(IEventBus modEventBus, ModContainer modContainer) {
        AddonDatagen.init();
    }

    public static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
