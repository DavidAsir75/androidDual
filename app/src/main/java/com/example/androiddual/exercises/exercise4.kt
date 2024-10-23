package com.example.androiddual.exercises

fun main() {
    // Llamamos a la función convertAndPrintTemperature con diferentes valores de prueba
    convertAndPrintTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = { celsius -> (9.0 / 5.0) * celsius + 32 }
    )

    convertAndPrintTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = { kelvin -> kelvin - 273.15 }
    )

    convertAndPrintTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = { fahrenheit -> (5.0 / 9.0) * (fahrenheit - 32) + 273.15 }
    )
}

// Renombramos la función para evitar conflictos de sobrecarga
fun convertAndPrintTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}


