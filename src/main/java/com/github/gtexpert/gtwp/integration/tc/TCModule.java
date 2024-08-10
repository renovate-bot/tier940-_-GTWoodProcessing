package com.github.gtexpert.gtwp.integration.tc;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.api.modules.GTWPModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.tc.loaders.recipes.TCWoodRecipe;
import com.github.gtexpert.gtwp.modules.GTWPModules;

@GTWPModule(
            moduleID = GTWPModules.MODULE_TC,
            containerID = GTWPValues.MODID,
            modDependencies = Mods.Names.THAUMCRAFT,
            name = "GTWoodProcessing Thaumcraft Integration",
            description = "Thaumcraft Integration Module")
public class TCModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        TCWoodRecipe.init();
    }
}
