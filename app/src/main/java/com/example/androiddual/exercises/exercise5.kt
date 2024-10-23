package com.example.androiddual.exercises

// Definición de la clase Song
class Song(
    val title: String,        // Título de la canción
    val artist: String,       // Artista que interpreta la canción
    val releaseYear: Int,     // Año de lanzamiento de la canción
    var playCount: Int        // Número de reproducciones
) {
    // Propiedad calculada que determina si la canción es popular
    val isPopular: Boolean
        get() = playCount >= 1000

    // Método para imprimir la descripción de la canción
    fun printDescription() {
        println("\"$title\", interpretada por $artist, se lanzó en $releaseYear.")
    }
}

fun main() {
    // Crear algunas canciones de ejemplo
    val song1 = Song("Shape of You", "Ed Sheeran", 2017, 5000)
    val song2 = Song("Despacito", "Luis Fonsi", 2017, 950)

    // Imprimir la descripción de cada canción
    song1.printDescription()
    song2.printDescription()

    // Comprobar si las canciones son populares
    println("¿${song1.title} es popular? ${if (song1.isPopular) "Sí" else "No"}")
    println("¿${song2.title} es popular? ${if (song2.isPopular) "Sí" else "No"}")
}
