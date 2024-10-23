package com.example.androiddual.exercises

fun main() {
    // Creación de objetos Person
    val amanda = Person("Amanda", 33, "play tennis", null)  // Amanda no tiene un referente
    val atiqah = Person("Atiqah", 28, "climb", amanda)      // Atiqah tiene como referente a Amanda

    // Mostrar los perfiles de Amanda y Atiqah
    amanda.showProfile()
    atiqah.showProfile()
}

// Definición de la clase Person
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    // Función que muestra el perfil de la persona
    fun showProfile() {
        // Imprimir el nombre y la edad
        println("Name: $name")
        println("Age: $age")

        // Imprimir la afición (hobby), verificando si es nulo
        if (hobby != null) {
            println("Likes to $hobby.")
        } else {
            println("No hobbies mentioned.")
        }

        // Verificar si la persona tiene un referente
        if (referrer != null) {
            // Si tiene referente, imprimimos el nombre del referente y su hobby (si lo tiene)
            if (referrer.hobby != null) {
                println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
            } else {
                println("Has a referrer named ${referrer.name}, who has no specific hobbies.")
            }
        } else {
            // Si no tiene referente
            println("Doesn't have a referrer.")
        }
    }
}
