package com.example.androiddual.codigo

fun main() {
    var name: String = "David"
    var name1: String = "David"
    var name2: String = "David"
    var name3: String = "David"

    //Indice 0-7
    //Tamaño 8
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
//    println(wweekdays) <--te da el la direccion memoria
//    println(weekDays[0])
//    println(weekDays.size)

    //Tamaños
    if (weekDays.size >= 8) {
//        println(weekDays[7])
    } else {
//        println("No hay mas valores en el array")
    }

    //Modificar valores
    weekDays[0] = "Feliz lunes"
//    println(weekDays[0])


    //Bucles para Arrays
    for(position in weekDays.indices){
//       println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
//        println("La posición $position, contiene $value")
    }

    for (inventado in weekDays){
        println("Ahora es $inventado")
    }

    weekDays.forEach { it }
}