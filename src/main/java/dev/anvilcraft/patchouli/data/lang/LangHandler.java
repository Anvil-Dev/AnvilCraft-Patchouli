package dev.anvilcraft.patchouli.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class LangHandler {

    /**
     * 语言文件初始化
     *
     * @param provider 提供器
     */
    public static void init(RegistrateLangProvider provider) {
        provider.add("gui.anvilcraft_patchouli.category.anvil_collision_craft_speed", "Speed: %d m/tick");

        provider.add("patchouli.anvilcraft_patchouli.landing_text", "Welcome to AnvilCraft.");

        // 所有类别信息
        provider.add("title.anvilcraft_patchouli.patchouli.advanced_features", "Advanced Features");
        provider.add("intro.anvilcraft_patchouli.patchouli.advanced_features", "More complex, more stronger.");
        provider.add("title.anvilcraft_patchouli.patchouli.basic_gameplay", "Basic Gameplay");
        provider.add("intro.anvilcraft_patchouli.patchouli.basic_gameplay", "The basic gameplay of AnvilCraft mainly includes changes caused by the falling anvil, which can transform blocks, process items, affect mobs, etc.$(br)This mod adds some blocks to facilitate early automation, including block placer, chute, etc., which can be viewed in the $(thing)Basic More Device$() entry.");
        provider.add("title.anvilcraft_patchouli.patchouli.machine_example", "Machine Example");
        provider.add("intro.anvilcraft_patchouli.patchouli.machine_example", "Here are some examples of machines that might be used to help you better understand the components of Anvilcraft and design your own automated production line. Have fun! $(br2) This part of the manual was written and maintained by $(l:https://space.bilibili.com/347845823)Bilibili@毛绒绒Fff$(). If you have any issues with the machines or any suggestions, feel free to send a private message.");
        provider.add("title.anvilcraft_patchouli.patchouli.power_system", "Power System");
        provider.add("intro.anvilcraft_patchouli.patchouli.power_system", "Stronger automation.");
        provider.add("title.anvilcraft_patchouli.patchouli.process", "Game Flow");
        provider.add("intro.anvilcraft_patchouli.patchouli.process", "A general guide to the survival process, for reference only. In the case of a modpack, you will need to refer to the tasks or tutorials of the modpack itself. The mod process is not fixed, and this article is only the most general one.");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing_system", "Forging System");
        provider.add("intro.anvilcraft_patchouli.patchouli.smithing_system", "Stronger anvil, forging and enchantments.");
        provider.add("title.anvilcraft_patchouli.patchouli.special_props", "Special props");
        provider.add("intro.anvilcraft_patchouli.patchouli.special_props", "Items and blocks with special functions.");
        provider.add("title.anvilcraft_patchouli.patchouli.structural_engineering", "Structural Engineering");
        provider.add("intro.anvilcraft_patchouli.patchouli.structural_engineering", "By building specific multi-block structures, we can create engineering machines with special functions. $(br2)$(#666666)Technology is not a rigid knowledge with only one solution, but a product that elevates us beyond the ordinary. Common people simply cannot understand our progress.$()");
        provider.add("title.anvilcraft_patchouli.patchouli.technology_application", "Technology application");
        provider.add("intro.anvilcraft_patchouli.patchouli.technology_application", "The production or transformation of new substances through the Anvilcraft technology.");

        // Entry titles for advanced category
        provider.add("title.anvilcraft_patchouli.patchouli.advanced.anvil_destroy", "Anvil Destroy");
        provider.add("title.anvilcraft_patchouli.patchouli.advanced.heated_block", "Heated Block");
        provider.add("title.anvilcraft_patchouli.patchouli.advanced.special_heated_block", "Special Heated Block");
        provider.add("title.anvilcraft_patchouli.patchouli.advanced.super_heating", "Super Heating");
        provider.add("title.anvilcraft_patchouli.patchouli.advanced.tool_properties", "Special Tool Properties");
        provider.add("title.anvilcraft_patchouli.patchouli.advanced.void_decay", "Void Decay");
        provider.add("title.anvilcraft_patchouli.patchouli.advanced.template_dissociation", "Template Dissociation");

        // Entry titles for apply category
        provider.add("title.anvilcraft_patchouli.patchouli.apply.corrupted_beacon", "Corrupted Beacon");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.space_overcompressor", "Space Overcompressor");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.neutron_irradiator", "Neutron Irradiator");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.cake", "Large Cake");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.cement", "Cement&Concrete");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.confinement", "Confined Anvilon");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.enchantment_copy", "Enchantment Copy");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.gem_transformation", "Gem Transformation");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.item_regeneration", "Advanced Item Regeneration");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.oil", "Oil");
        provider.add("title.anvilcraft_patchouli.patchouli.apply.spawner", "Create Spawner");

        // Entry titles for basic category
        provider.add("title.anvilcraft_patchouli.patchouli.basic.amethyst_tools", "Amethyst Tools");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.block_processing", "Basic Block Processing");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.end_portal", "Block Falls Into End Portal");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.introduction", "Basic Introduction");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.item_processing", "Basic Item Processing");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.item_regeneration", "Basic Item Regeneration");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.material", "Basic Material");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.minerals", "Basic Minerals");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.more_device", "More Practical Device");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.more_processing", "More Processing");
        provider.add("title.anvilcraft_patchouli.patchouli.basic.vanilla_improve", "Vanilla Improve");

        // Entry titles for machine category
        provider.add("title.anvilcraft_patchouli.patchouli.machine.automation", "Automation");
        provider.add("title.anvilcraft_patchouli.patchouli.machine.electricity_generation", "Electricity Generation");
        provider.add("title.anvilcraft_patchouli.patchouli.machine.resources_access", "Resources Access");

        // Entry titles for power category
        provider.add("title.anvilcraft_patchouli.patchouli.power.basic_generation", "Basic Power Generation");
        provider.add("title.anvilcraft_patchouli.patchouli.power.consumption", "Power Usage");
        provider.add("title.anvilcraft_patchouli.patchouli.power.heat_collection", "Heat Collection");
        provider.add("title.anvilcraft_patchouli.patchouli.power.introduction", "Power Introduction");
        provider.add("title.anvilcraft_patchouli.patchouli.power.large_electromagnet", "Large Electromagnet");
        provider.add("title.anvilcraft_patchouli.patchouli.power.laser_system", "Laser System");
        provider.add("title.anvilcraft_patchouli.patchouli.power.negative_matter", "Negative Matter Power Generation");
        provider.add("title.anvilcraft_patchouli.patchouli.power.nuclear", "Nuclear Power Generation");
        provider.add("title.anvilcraft_patchouli.patchouli.power.store", "Power Store");
        provider.add("title.anvilcraft_patchouli.patchouli.power.transmission", "Power Transmission");
        provider.add("title.anvilcraft_patchouli.patchouli.power.void_energy_collection", "Void Energy Collection");
        provider.add("title.anvilcraft_patchouli.patchouli.power.weapon", "Electric Energy Weapon");

        // Entry titles for process category
        provider.add("title.anvilcraft_patchouli.patchouli.process.1", "Process 1-Opening");
        provider.add("title.anvilcraft_patchouli.patchouli.process.2", "Process 2-Get Magnet");
        provider.add("title.anvilcraft_patchouli.patchouli.process.3", "Process 3-Anvil Processing");
        provider.add("title.anvilcraft_patchouli.patchouli.process.4", "Process 4-Power Generation&Smelting");
        provider.add("title.anvilcraft_patchouli.patchouli.process.5", "Process 5-Royal Steel&Cursed Gold");
        provider.add("title.anvilcraft_patchouli.patchouli.process.6", "Process 6-Corrupted Beacon&Time Warp");
        provider.add("title.anvilcraft_patchouli.patchouli.process.7", "Process 7-Giant Anvil");
        provider.add("title.anvilcraft_patchouli.patchouli.process.8", "Process 8-Get More Gems");
        provider.add("title.anvilcraft_patchouli.patchouli.process.9", "Process 9-Unlimited Metal Ore");
        provider.add("title.anvilcraft_patchouli.patchouli.process.10", "Process 10-Get More Netherite Ingot");
        provider.add("title.anvilcraft_patchouli.patchouli.process.11", "Process 11-Get More EmberMetal");
        provider.add("title.anvilcraft_patchouli.patchouli.process.12", "Process 12-Greater Power Generation");
        provider.add("title.anvilcraft_patchouli.patchouli.process.13", "Process 13-Anvil Collision Craft");
        provider.add("title.anvilcraft_patchouli.patchouli.process.14", "Process 14-Neutronium Ingot");
        provider.add("title.anvilcraft_patchouli.patchouli.process.15", "Process 15-Transcendium Ingot");
        provider.add("title.anvilcraft_patchouli.patchouli.process.16", "Process 16-Transcendium Template");

        // Entry titles for prop category
        provider.add("title.anvilcraft_patchouli.patchouli.prop.amulet", "Amulet");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.amulet_box", "Amulet Box");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.fluid", "Fluid System");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.ionocraft", "Ionocraft Backpack");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.redstone", "Redstone Components");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.sliding_rail", "Sliding Rail");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.storage_block", "Storage Block");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.tier_1_food", "Simple Food");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.pill", "Pill");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.tier_2_food", "Advanced Food");
        provider.add("title.anvilcraft_patchouli.patchouli.prop.totem", "Totem");

        // Entry titles for smithing category
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.ranged_weapons", "Ranged Weapons");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.introduction", "Smithing Introduction");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.jewelcrafting_table", "Jewelcrafting Table");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.tier_1_forge", "Tier 1 Forge");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.tier_1_materials", "Tier 1 Materials");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.tier_2_forge", "Tier 2 Forge");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.tier_2_materials", "Tier 2 Materials");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.tier_3_forge", "Tier 3 Forge");
        provider.add("title.anvilcraft_patchouli.patchouli.smithing.tier_3_materials", "Tier 3 Materials");

        // Entry titles for struct category
        provider.add("title.anvilcraft_patchouli.patchouli.struct.collision", "Anvil Collision Craft");
        provider.add("title.anvilcraft_patchouli.patchouli.struct.giant_anvil_shocking", "Giant Anvil Shocking");
        provider.add("title.anvilcraft_patchouli.patchouli.struct.mineral_fountain", "Mineral Fountain");
        provider.add("title.anvilcraft_patchouli.patchouli.struct.multiblock", "Multiblock Transformation&Craft");
        provider.add("title.anvilcraft_patchouli.patchouli.struct.overseer", "Overseer: Chunk Loader");
    }
}
