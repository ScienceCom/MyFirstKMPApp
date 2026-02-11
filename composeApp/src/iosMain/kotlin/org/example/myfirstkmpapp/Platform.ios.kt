package org.example.myfirstkmpapp

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

// Platform.ios.kt
actual fun getPlatformName(): String {
    return UIDevice.currentDevice.systemName()
}
