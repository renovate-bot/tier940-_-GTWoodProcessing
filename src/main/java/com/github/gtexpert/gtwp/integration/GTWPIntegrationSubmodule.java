package com.github.gtexpert.gtwp.integration;

import java.util.Collections;
import java.util.Set;

import net.minecraft.util.ResourceLocation;

import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.util.GTWPUtility;
import com.github.gtexpert.gtwp.modules.BaseGTWPModule;
import com.github.gtexpert.gtwp.modules.GTWPModules;

public class GTWPIntegrationSubmodule extends BaseGTWPModule {

    private static final Set<ResourceLocation> DEPENDENCY_UID = Collections.singleton(
            GTWPUtility.gtwpId(GTWPModules.MODULE_INTEGRATION));

    @NotNull
    @Override
    public Logger getLogger() {
        return GTWPIntegrationModule.logger;
    }

    @NotNull
    @Override
    public Set<ResourceLocation> getDependencyUids() {
        return DEPENDENCY_UID;
    }
}
