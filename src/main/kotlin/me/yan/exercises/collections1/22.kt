package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    22. Faça um programa que leia dois vetores de 5 posições e calcule outro vetor contendo:
        a. nas posições pares os valores do primeiro vetor
        b. nas posições ímpares os valores do segundo vetor
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
        if (i % 2 == 0) vectorC.add(vectorA[i]) else vectorC.add(vectorB[i])
    }

    println(vectorC)
}