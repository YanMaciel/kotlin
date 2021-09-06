package me.yan.exercises.loops

import kotlin.random.Random

/* 32. Faça um programa que simula o lançamento de dois dados, d1 e d2, n vezes, e tem como saída
o número de cada dado e a relação entre eles (>,<,=) de cada lançamento. */

fun main() {
    var numL = 0
    var state = true
    while (state) {
        println("Insira um número inteiro positivo:")
        numL = readInt()
        if (numL > 0) state = false
    }
    for (i in 1..numL) {
        val d1 = Random.nextInt(1,7)
        val d2 = Random.nextInt(1,7)
        println("No ${i}º lançamento:")

        if (d1 == d2) println("Os dados são iguais!!! O Valor do dado d1 é $d1 e o do dado d2 é $d2")
        if (d1 > d2) println("O dado d1 é maior que o d2, pois $d1 > $d2")
        if (d1 < d2) println("O dado d1 é menor que o d2, pois $d1 < $d2")
    }
}