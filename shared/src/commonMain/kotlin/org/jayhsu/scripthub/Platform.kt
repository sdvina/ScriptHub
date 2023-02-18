package org.jayhsu.scripthub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform