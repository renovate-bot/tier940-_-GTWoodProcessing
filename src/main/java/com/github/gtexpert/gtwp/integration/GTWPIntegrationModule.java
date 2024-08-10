package com.github.gtexpert.gtwp.integration;

import java.util.Collections;
import java.util.List;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.api.modules.GTWPModule;
import com.github.gtexpert.gtwp.modules.BaseGTWPModule;
import com.github.gtexpert.gtwp.modules.GTWPModules;

@GTWPModule(
            moduleID = GTWPModules.MODULE_INTEGRATION,
            containerID = GTWPValues.MODID,
            name = "GTWoodProcessing Mod Integration",
            description = "General GTWoodProcessing Integration Module. Disabling this disables all integration modules.")

public class GTWPIntegrationModule extends BaseGTWPModule {

    public static final Logger logger = LogManager.getLogger("GTWoodProcessing Mod Integration");

    @NotNull
    @Override
    public Logger getLogger() {
        return logger;
    }

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(GTWPIntegrationModule.class);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }
}
