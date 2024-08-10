package com.github.gtexpert.gtwp.core;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.registries.IForgeRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.api.modules.GTWPModule;
import com.github.gtexpert.gtwp.api.modules.IGTWPModule;
import com.github.gtexpert.gtwp.common.CommonProxy;
import com.github.gtexpert.gtwp.loaders.recipe.GTWPWoodRecipe;
import com.github.gtexpert.gtwp.modules.GTWPModules;

import gregtech.loaders.recipe.RecyclingRecipes;

@GTWPModule(
            moduleID = GTWPModules.MODULE_CORE,
            containerID = GTWPValues.MODID,
            name = "GTWoodProcessing",
            description = "Core GTWoodProcessing content.",
            coreModule = true)
public class GTWPCoreModule implements IGTWPModule {

    public static final Logger logger = LogManager.getLogger("GTWoodProcessing");

    @SidedProxy(modId = GTWPValues.MODID,
                clientSide = "com.github.gtexpert.gtwp.client.ClientProxy",
                serverSide = "com.github.gtexpert.gtwp.common.CommonProxy")
    public static CommonProxy proxy;

    @Override
    public @NotNull Logger getLogger() {
        return logger;
    }

    @Override
    public void construction(FMLConstructionEvent event) {}

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {}

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        RecyclingRecipes.init();
    }

    @Override
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
    }

    @Override
    public void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {}

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        GTWPWoodRecipe.init();
    }
}
