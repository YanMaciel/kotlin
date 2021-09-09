package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    8. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos na ordem inversa.
 */

fun main() {
    val list = mutableListOf<Int>()
    println("Insira 6 números inteiros.")

    for (i in 1..6) {
        println("${i}º número:")
        val num = readInt()
        list.add(num)
    }
    println("Lista normal: $list")
    println("Lista invertida: ${list.reversed()}")
}