package com.xlauncher.data.net.modrinth

import com.xlauncher.data.net.HttpClient
import okhttp3.Request

object ModrinthApi {
  private const val BASE = "https://api.modrinth.com/v2"

  fun searchUrl(query: String, limit: Int = 20): String =
    "$BASE/search?query=${query}&limit=$limit"

  fun rawGet(url: String): String {
    val req = Request.Builder()
      .url(url)
      .header("User-Agent", "XLauncher/0.1.0 (Android)")
      .build()

    HttpClient.client.newCall(req).execute().use { resp ->
      if (!resp.isSuccessful) error("HTTP ${resp.code}")
      return resp.body?.string() ?: ""
    }
  }
}

