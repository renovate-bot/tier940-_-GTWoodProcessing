package com.github.gtexpert.gtwp.api.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.gtexpert.gtwp.api.GTWPValues;

public class GTWPLog {

    private GTWPLog() {}

    public static Logger logger = LogManager.getLogger(GTWPValues.MODNAME);
}
