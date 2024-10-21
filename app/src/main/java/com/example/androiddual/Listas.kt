package com.example.androiddual

fun main(){
    mutableList()
}

fun mutableList() {
    val frutas:MutableList<String> = mutableListOf("peras", "manzanas", "naranja", "limon", "cereza", "melon", "Sandia")
    frutas.add(3,"David")
    println(frutas)

    if(frutas.isEmpty()){
        //No voy a pintar nada porque no hay
    }else{
        frutas.forEach { println(it) }
    }

    if(frutas.isNotEmpty()){
        frutas.forEach { println(it) }
    }

    frutas.last()

    for(invento in frutas){

    }

    frutas.forEach {  }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("peras", "manzanas", "naranja", "limon", "cereza", "melon", "Sandia")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

//    Filtrar
    val example = readOnly.filter { it.contains("a")  }
    println(example)

    //Iterar
    readOnly.forEach { frutas -> println(frutas) }
}