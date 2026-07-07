package com.xlauncher.work

data class DownloadRequest(
  val url: String,
  val outPath: String,
  val sha1: String? = null
)

