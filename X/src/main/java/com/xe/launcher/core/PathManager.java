package com.xe.launcher.core;

import java.io.File;

public class PathManager {
    
    // The root directory where the application is running
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
        return new File(ROOT_DIR, "X/libs");
    }

    // Ensures all required directories exist
    public static void initializeDirectories() {
        getMinecraftDir().mkdirs();
        getJavaDir().mkdirs();
        getAccountsDir().mkdirs();
        getLibsDir().mkdirs();
    }
}
