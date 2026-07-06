package com.xe.launcher.auth;

import java.io.File;
import com.xe.launcher.core.PathManager;

public class AuthManager {

    // Define the type of account
    public enum AccountType {
        MICROSOFT, GITHUB, OFFLINE
    }

    // Method to save account session in the /accounts directory
    public void saveAccount(String username, String token, AccountType type) {
        File accountFile = new File(PathManager.getAccountsDir(), username + ".json");
        // Logic: Store credentials in JSON format using GSON
    }

    // Method to validate the session
    public boolean isAuthenticated(String username) {
        File accountFile = new File(PathManager.getAccountsDir(), username + ".json");
        return accountFile.exists();
    }
}
