package com.github.gtexpert.gtwp.modules;

import java.util.Collections;
import java.util.Set;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.modules.IGTWPModule;
import com.github.gtexpert.gtwp.api.util.GTWPUtility;

public abstract class BaseGTWPModule implements IGTWPModule {

    @NotNull
    @Override
    public Set<ResourceLocation> getDependencyUids() {
        return Collections.singleton(GTWPUtility.gtwpId(GTWPModules.MODULE_CORE));
    }
}
