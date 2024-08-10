package com.github.gtexpert.gtwp.integration.binnies.extratrees;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.api.modules.GTWPModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.binnies.extratrees.loaders.recipes.ExtraTreesWoodRecipe;
import com.github.gtexpert.gtwp.modules.GTWPModules;

@GTWPModule(
            moduleID = GTWPModules.MODULE_EXTREES,
            containerID = GTWPValues.MODID,
            modDependencies = { Mods.Names.FORESTRY, Mods.Names.EXTRA_TREES },
            name = "GTWoodProcessing Extra Trees(Binnie's Mods) Integration",
            description = "Extra Trees(Binnie's Mods) Integration Module")
public class ExtraTreesModule extends GTWPIntegrationSubmodule {

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        ExtraTreesWoodRecipe.init();
    }
}
