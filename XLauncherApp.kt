package com.xlauncher

import android.app.Application
import com.xlauncher.paths.XPaths

class XLauncherApp : Application() {
  override fun onCreate() {
    super.onCreate()
    XPaths.ensureBaseTree(this)
    // Create a default instance immediately (can be expanded later)
    XPaths.ensureInstanceTree(this, "default")
  }
}

