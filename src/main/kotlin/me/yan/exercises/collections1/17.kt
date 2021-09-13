package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    17. Leia um vetor de 10 posições e atribua valor 0 para todos so elementos que possuírem valores negativos.
*/

fun main() {
    val vector = mutableListOf<Int>()

    println("Insira 6 números inteiros para compor seu vetor.")

    for (i in 1..6) {
        print("${i}º número: ")
        var num = readInt()
        if (num < 0) num = 0
        vector.add(num)
    }
    println(vector)
}