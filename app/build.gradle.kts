plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
}

android {
  namespace = "com.xlauncher"
  compileSdk = 35

  defaultConfig {
    applicationId = "com.xlauncher"
    minSdk = 26
    targetSdk = 35
    versionCode = 1
    versionName = "0.1.0"
  }

  buildFeatures {
    viewBinding = true
  }
}

dependencies {
  implementation("androidx.core:core-ktx:1.15.0")
  implementation("androidx.appcompat:appcompat:1.7.0")
  implementation("com.google.android.material:material:1.12.0")
  implementation("androidx.constraintlayout:constraintlayout:2.2.0")

  implementation("androidx.navigation:navigation-fragment-ktx:2.8.5")
  implementation("androidx.navigation:navigation-ui-ktx:2.8.5")

  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.9.0")

  implementation("com.squareup.okhttp3:okhttp:4.12.0")

  implementation("androidx.work:work-runtime-ktx:2.10.0")
}
