package com.github.gtexpert.gtwp.integration.tc.loaders.recipes;

import java.util.Arrays;
import java.util.List;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

import gregtech.api.recipes.ModHandler;
import gregtech.loaders.WoodTypeEntry;

public class TCWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Thaumcraft.name();
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "silverwood")
                            .planks(Mods.Thaumcraft.getItem("plank_silverwood", 1), null)
                            .log(Mods.Thaumcraft.getItem("log_silverwood", 1))
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "greatwood")
                            .planks(Mods.Thaumcraft.getItem("plank_greatwood", 1), null)
                            .log(Mods.Thaumcraft.getItem("log_greatwood", 1))
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        ModHandler.removeRecipeByName(Mods.Thaumcraft.getResource("planksilverwood"));
        ModHandler.removeRecipeByName(Mods.Thaumcraft.getResource("plankgreatwood"));

        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
