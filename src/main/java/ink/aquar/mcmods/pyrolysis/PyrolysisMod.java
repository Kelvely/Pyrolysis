package ink.aquar.mcmods.pyrolysis;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

@Mod(modid = PyrolysisMod.MOD_ID, name = PyrolysisMod.NAME, version = PyrolysisMod.VERSION)
public class PyrolysisMod {

    public static final String MOD_ID = "pyrolysis";
    public static final String NAME = "Pyrolysis";
    public static final String VERSION = "1.0a";

    private static Logger logger;

    private static PyrolysisMod instance;
    { instance = this; }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        long startTime = System.currentTimeMillis();
        logger = event.getModLog();

        // Creating and reading the config file
        // Registering Capabilities(see https://mcforge.readthedocs.io/en/latest/datastorage/capabilities/)

        logger.log(Level.INFO, "Finished pre init in " + (System.currentTimeMillis() - startTime) + " ms.");
        logger.log(Level.INFO, "Pyrolysis with version "+ VERSION + " is loaded.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        long startTime = System.currentTimeMillis();

        // Registering world generators
        // Registering event handlers
        // Sending Inter Mod Comm messages

        logger.log(Level.INFO, "Finished init in " + (System.currentTimeMillis() - startTime) + " ms.");

    }

    public void postInit(FMLPostInitializationEvent event) {
        long startTime = System.currentTimeMillis();

        // Mod compatibility, or anything which depends on other mods’ init phases being finished

        logger.log(Level.INFO, "Finished post init in " + (System.currentTimeMillis() - startTime) + " ms.");

    }

}
