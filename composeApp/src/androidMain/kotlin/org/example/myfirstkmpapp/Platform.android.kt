package org.example.myfirstkmpapp

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

// Platform.android.kt
actual fun getPlatformName(): String {
    return "Android ${Build.VERSION.SDK_INT}"
}