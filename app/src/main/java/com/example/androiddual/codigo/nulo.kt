package com.example.androiddual.codigo


///Si name no es nulo dame la posicion 3  de nombre pero si lo es dilo
fun main(){
    //var name:String? ="David"
    var name:String? = null

    println(name?.get(3) ?:  "Tranquilo es nulo ")
}