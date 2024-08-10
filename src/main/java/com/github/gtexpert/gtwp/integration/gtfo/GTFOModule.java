package com.github.gtexpert.gtwp.integration.gtfo;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.api.modules.GTWPModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.gtfo.loaders.recipes.GTFOWoodRecipe;
import com.github.gtexpert.gtwp.modules.GTWPModules;

@GTWPModule(
            moduleID = GTWPModules.MODULE_GTFO,
            containerID = GTWPValues.MODID,
            modDependencies = Mods.Names.GREGTECH_FOOD_OPTION,
            name = "GTWoodProcessing GregTech Food Option Integration",
            description = "GregTech Food Option Integration Module")
public class GTFOModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        GTFOWoodRecipe.init();
    }
}
