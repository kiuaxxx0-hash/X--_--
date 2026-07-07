package com.xlauncher.data.net

import okhttp3.OkHttpClient

object HttpClient {
  val client: OkHttpClient = OkHttpClient.Builder()
    .retryOnConnectionFailure(true)
    .build()
}

