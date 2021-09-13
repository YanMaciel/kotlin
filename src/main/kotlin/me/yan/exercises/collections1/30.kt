package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    30. Faça um programa que leia dois vetores de 5 elementos. Crie um vetor que seja a intersecção entre os dois
    vetores anteriores, ou seja, que contém apenas os números que estão em ambos os vetores. Não deve conter números
    repetitidos.
*/

fun main() {
    val vectorA = mutableListOf<Int>()
    val vectorB = mutableListOf<Int>()
    val vectorC = mutableListOf<Int>()

    println("Componha o vetor A com 5 números inteiros positivos.")
    for (i in 1..5) {
        print("Vetor A -> ${i}º número: ")
        val numA = readInt()
        vectorA.add(numA)
    }
    println("Componha o vetor B com 5 números inteiros positivos.")
    for (i in 1..5) {
        print("Vetor B -> ${i}º número: ")
        val numB = readInt()
        vectorB.add(numB)
    }

    for (i in vectorA.indices) {
        for (j in vectorB.indices) {
            if (vectorA[i] == vectorB[j]) vectorC.add(vectorA[i])
        }
    }
    val vectorCDistinct = vectorC.distinct()

    println("A intersecção entre o Vetor A e o Vetor B é => $vectorCDistinct.")
}