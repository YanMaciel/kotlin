package me.yan.exercises.loops

/* 23. Faça um algoritmo que leia um número positivo e imprima seus divisores. */

fun main() {
    var state = true
    var num = 0
    while (state) {
        println("Insira um número inteiro positivo:")
        num = readInt()
        if (num > 0) state = false
    }

    for (n in 1..num) {
        if (num % n == 0) {
            println(n)
        }
    }
}