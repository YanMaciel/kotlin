package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    21. Faça um programa que receba do usuário dois vetores, A e B, com 5 números inteiros cada. Crie um novo vetor
    denominado C calculando C = A - B. Mostre na tela o vetor C.
*/

fun main() {
    val vectorA = mutableListOf<Int>()
    val vectorB = mutableListOf<Int>()
    val vectorC = mutableListOf<Int>()

    println("Componha o vetor A e o vetor B com 5 números inteiros positivos cada.")
    for (i in 1..5) {
        print("Vetor A -> ${i}º número: ")
        val numA = readInt()
        vectorA.add(numA)
        print("Vetor B -> ${i}º número: ")
        val numB = readInt()
        vectorB.add(numB)
    }

    for (i in vectorA.indices) {
        val numC = vectorA[i] - vectorB[i]
        vectorC.add(numC)
    }
    println("Vetor C => $vectorC")
}