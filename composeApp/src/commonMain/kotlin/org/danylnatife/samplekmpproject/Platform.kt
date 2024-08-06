package org.danylnatife.samplekmpproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform