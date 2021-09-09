package me.yan.exercises.collections1


import me.yan.exercises.loops.readInt

/*
    5. Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.
 */

fun main() {
    val vector = mutableListOf<Int>()
    var count = 0

    println("Insira 10 números inteiros para compor o vetor.")
    for (i in 1..10) {
        print("${i}º número: ")
        val num = readInt()
        vector.add(num)
        if (num % 2 == 0) count++
    }
    println("Há $count números pares no seu vetor.")
}