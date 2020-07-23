package com.epam.Exception_logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger Logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Logger.debug("This is debug");
        Logger.info("This is info");
        Logger.warn("This is warn");
        Logger.error("This is error");
        Logger.fatal("This is fatal");
    }
}