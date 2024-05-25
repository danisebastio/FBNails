package it.fb.fbnails

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform