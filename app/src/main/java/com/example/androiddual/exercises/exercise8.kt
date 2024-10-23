package com.example.androiddual.exercises

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

// Función que determina el precio final de la subasta
fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    // Si hay una oferta válida (no es null), devolvemos el importe de la oferta
    // Si no hay oferta (es null), devolvemos el precio mínimo
    return bid?.amount ?: minimumPrice
}
