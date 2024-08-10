package com.github.gtexpert.gtwp.integration.tc;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.modules.GTWPModules;

@Config.LangKey(GTWPValues.MODID + ".config.integration.tc")
@Config(modid = GTWPValues.MODID,
        name = GTWPValues.MODID + "/integration/" + GTWPModules.MODULE_TC,
        category = "Thaumcraft")
public class TCConfigHolder {}
