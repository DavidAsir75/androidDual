package com.example.androiddual.exercises

// Modificamos la clase Phone para que sea 'open' y permita la herencia
open class Phone(var isScreenLightOn: Boolean = false) {
    // El método switchOn también debe ser 'open' para que pueda ser sobrescrito
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

// Clase FoldablePhone que hereda de Phone
class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {

    // Sobrescribimos el comportamiento de switchOn para que solo encienda si no está plegado
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
            println("The screen is now on.")
        } else {
            println("Cannot turn on the screen because the phone is folded.")
        }
    }

    // Método para plegar el teléfono
    fun fold() {
        isFolded = true
        println("The phone is now folded.")
    }

    // Método para desplegar el teléfono
    fun unfold() {
        isFolded = false
        println("The phone is now unfolded.")
    }
}

fun main() {
    // Crear un teléfono plegable
    val foldablePhone = FoldablePhone()

    // Intentar encender la pantalla con el teléfono plegado
    foldablePhone.switchOn() // No debe encender la pantalla

    // Desplegar el teléfono y encender la pantalla
    foldablePhone.unfold()
    foldablePhone.switchOn() // Ahora debe encender la pantalla

    // Verificar el estado de la pantalla
    foldablePhone.checkPhoneScreenLight()

    // Plegar el teléfono y verificar si la pantalla sigue encendida
    foldablePhone.fold()
    foldablePhone.checkPhoneScreenLight() // La pantalla debería seguir encendida, pero no se puede volver a encender mientras esté plegado
}
