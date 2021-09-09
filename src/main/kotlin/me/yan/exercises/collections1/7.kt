package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    7. Escreva um programa que leia 10 números inteiros e os armazene em um vetor. Imprima o vetor, o maior elemento e
    a posição que ele se encontra.
 */

fun main() {
    val vector = mutableListOf<Int>()

    println("Insira 10 números inteiros para compor o vetor.")
    for (i in 1..10) {
        print("${i}º número: ")
        val num = readInt()
        vector.add(num)
    }
    println(vector)
    println("O maior elemento do vetor é ${vector.maxOrNull()}, na posição ${vector.indexOf(vector.maxOrNull())}.")
}