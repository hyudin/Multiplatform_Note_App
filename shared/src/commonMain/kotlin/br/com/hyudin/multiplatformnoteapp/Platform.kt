package br.com.hyudin.multiplatformnoteapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform