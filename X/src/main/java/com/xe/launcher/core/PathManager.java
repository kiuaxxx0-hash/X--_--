package com.xe.launcher.core;

import java.io.File;

public class PathManager {
    // Defining base directories for the Xe Launcher
    public static final String ROOT_DIR = System.getProperty("user.dir");
    
    public static File getMinecraftDir() {
        return new File(ROOT_DIR, "minecraft");
    }

    public static File getJavaDir() {
        return new File(ROOT_DIR, "java");
    }

    public static File getAccountsDir() {
        return new File(ROOT_DIR, "accounts");
    }

    public static File getLibsDir() {
        return new File(ROOT_DIR, "libs");
    }

    // Method to ensure directories exist upon startup
    public static void initializeDirectories() {
        getMinecraftDir().mkdirs();
        getJavaDir().mkdirs();
        getAccountsDir().mkdirs();
        getLibsDir().mkdirs();
    }
}

