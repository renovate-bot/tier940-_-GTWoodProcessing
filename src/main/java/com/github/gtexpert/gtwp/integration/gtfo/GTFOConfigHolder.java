package com.github.gtexpert.gtwp.integration.gtfo;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.modules.GTWPModules;

@Config.LangKey(GTWPValues.MODID + ".config.integration.gtfo")
@Config(modid = GTWPValues.MODID,
        name = GTWPValues.MODID + "/integration/" + GTWPModules.MODULE_GTFO,
        category = "GregTech Food Option")
public class GTFOConfigHolder {}
