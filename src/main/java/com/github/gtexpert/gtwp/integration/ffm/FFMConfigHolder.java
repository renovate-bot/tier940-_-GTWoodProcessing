package com.github.gtexpert.gtwp.integration.ffm;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.GTWPValues;
import com.github.gtexpert.gtwp.modules.GTWPModules;

@Config.LangKey(GTWPValues.MODID + ".config.integration.ffm")
@Config(modid = GTWPValues.MODID,
        name = GTWPValues.MODID + "/integration/" + GTWPModules.MODULE_FFM,
        category = "Forestry")
public class FFMConfigHolder {}
