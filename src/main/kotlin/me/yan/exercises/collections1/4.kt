package me.yan.exercises.collections1

import me.yan.exercises.loops.readDouble
import me.yan.exercises.loops.readInt

/*
    4. Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois valores X e Y quaisquer
    correspondentes a duas posições do vetor. Ao final seu programa deverá escrever a soma dos valores encontrados
    nas respectivas posições X e Y.
 */

fun main() {
    val vector = mutableListOf<Int>()

    println("Insira abaixo um conjunto de 8 números reais para compor um vetor.")
    for (i in 1..8) {
        print("${i}º número: ")
        val num = readInt()
        vector.add(num)
    }

    println("Escolha duas posições do vetor.")
    while (true) {
        print("Posição X: ")
        val x = readInt()

    }
}