package com.xlauncher.paths

import android.content.Context
import java.io.File

object XPaths {

  fun base(context: Context): File =
    File(context.filesDir, "xlauncher")

  fun profiles(context: Context) = File(base(context), "profiles")

  fun runtimes(context: Context) = File(base(context), "runtimes")
  fun jre8(context: Context) = File(runtimes(context), "jre8")
  fun jre17(context: Context) = File(runtimes(context), "jre17")
  fun jre21(context: Context) = File(runtimes(context), "jre21")

  fun minecraft(context: Context) = File(base(context), "minecraft")
  fun instances(context: Context) = File(minecraft(context), "instances")

  fun instanceRoot(context: Context, instanceId: String) =
    File(instances(context), instanceId)

  fun dotMinecraft(context: Context, instanceId: String) =
    File(instanceRoot(context, instanceId), ".minecraft")

  fun versions(context: Context, instanceId: String) =
    File(dotMinecraft(context, instanceId), "versions")

  fun libraries(context: Context, instanceId: String) =
    File(dotMinecraft(context, instanceId), "libraries")

  fun assets(context: Context, instanceId: String) =
    File(dotMinecraft(context, instanceId), "assets")

  fun mods(context: Context, instanceId: String) =
    File(dotMinecraft(context, instanceId), "mods")

  fun config(context: Context, instanceId: String) =
    File(dotMinecraft(context, instanceId), "config")

  fun logs(context: Context) = File(base(context), "logs")

  fun ensureBaseTree(context: Context) {
    listOf(
      base(context),
      profiles(context),
      runtimes(context),
      minecraft(context),
      instances(context),
      logs(context)
    ).forEach { it.mkdirs() }
  }

  fun ensureInstanceTree(context: Context, instanceId: String) {
    listOf(
      instanceRoot(context, instanceId),
      dotMinecraft(context, instanceId),
      versions(context, instanceId),
      libraries(context, instanceId),
      assets(context, instanceId),
      mods(context, instanceId),
      config(context, instanceId)
    ).forEach { it.mkdirs() }
  }
}

