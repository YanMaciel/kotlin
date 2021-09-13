package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    15. Leia um vetor com 20 números inteiros. Escreva os elementos do vetor eliminando elementos repetidos.
*/

fun main() {
    val vector = mutableListOf<Int>()
    println("Insira 20 números inteiros para compor seu vetor.")

    for (i in 1..20) {
        print("${i}º número: ")
        val num = readInt()
        vector.add(num)
    }
    println("Os elementos distintos do seu vetor são: ${vector.distinct()}")
}