package com.xe.launcher.core;

import java.io.File;

public class JavaManager {
    
    // Check if a valid Java Runtime exists in the /java folder
    public static boolean isJavaAvailable() {
        File javaDir = PathManager.getJavaDir();
        File[] files = javaDir.listFiles();
        return files != null && files.length > 0;
    }

    // Get the path to the executable java file
    public static String getJavaExecutablePath() {
        // Logic to find java binary inside /java folder
        return PathManager.getJavaDir().getAbsolutePath() + "/bin/java";
    }
}

