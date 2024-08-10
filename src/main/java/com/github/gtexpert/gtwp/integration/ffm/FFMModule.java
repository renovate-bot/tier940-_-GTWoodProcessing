package com.github.gtexpert.gtwp.integration.ffm;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.api.modules.GTWPModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.ffm.loaders.recipes.FFMWoodRecipe;
import com.github.gtexpert.gtwp.modules.GTWPModules;

@GTWPModule(
            moduleID = GTWPModules.MODULE_FFM,
            containerID = GTWPValues.MODID,
            modDependencies = Mods.Names.FORESTRY,
            name = "GTWoodProcessing Forestry For Minecraft Integration",
            description = "Forestry For Minecraft Integration Module")
public class FFMModule extends GTWPIntegrationSubmodule {

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        FFMWoodRecipe.init();
    }
}
