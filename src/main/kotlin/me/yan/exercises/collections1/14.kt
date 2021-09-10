package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    14. Faça um programa que leia um vetor de 10 posições e verifique se existem valores iguais e os escreva na tela.
 */

fun main() {
    val vector = mutableListOf<Int>()
    println("Insira 10 números inteiros para compor seu vetor:")

    for (i in 1..10){
        print("${i}º número: ")
        val num = readInt()
        vector.add(num)
    }

    val repeatedValue = vector.groupingBy { it }.eachCount().filter { it.value > 1 }
    println("Os valores que se repetem no seu vetor são: ${repeatedValue.keys}")
}