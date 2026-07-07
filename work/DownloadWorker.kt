package com.xlauncher.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.xlauncher.data.net.HttpClient
import okhttp3.Request
import java.io.File

class DownloadWorker(
  appContext: Context,
  params: WorkerParameters
) : CoroutineWorker(appContext, params) {

  override suspend fun doWork(): Result {
    val url = inputData.getString("url") ?: return Result.failure()
    val outPath = inputData.getString("outPath") ?: return Result.failure()

    val outFile = File(outPath)
    outFile.parentFile?.mkdirs()

    val req = Request.Builder().url(url).build()
    HttpClient.client.newCall(req).execute().use { resp ->
      if (!resp.isSuccessful) return Result.retry()
      val body = resp.body ?: return Result.retry()
      outFile.outputStream().use { os ->
        body.byteStream().use { it.copyTo(os) }
      }
    }
    return Result.success()
  }
}

