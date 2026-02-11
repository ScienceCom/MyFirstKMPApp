package org.example.myfirstkmpapp

class Greeting {
    private val platform = getPlatformName()

    fun greet(): String {
        return "Hello, ${platform.length}!"
    }
}