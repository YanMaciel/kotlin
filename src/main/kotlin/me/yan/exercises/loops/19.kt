package me.yan.exercises.loops

/* 19. Escreva um algoritmo que leia um número inteiro entre 100 e 999 e imprima na saída
cada um dos algarismos que compõem o número. */


fun main() {

    var state = true
    var num = 0
    while (state) {
        println("Insira um número inteiro entre 100 e 999:")
        num = readInt()
        if (num in 100..999) state = false
    }
    val numString = num.toString()
    for (element in numString) println(element)
}