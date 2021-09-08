package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    2. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
 */

fun main() {
    val list = mutableListOf<Int>()

    println("Digite 6 números inteiros.")
    for (i in 1..6) {
        print("${i}º número: ")
        val num = readInt()
        list.add(num)
    }
    println(list)
}