package me.yan.exercises.loops

/* 7. Faça um programa que leia 10 inteiros positivos, ignorando não positivos, e imprima sua média. */

fun main() {
    println("Digite 10 números inteiros positivos para calcularmos a média deles: ")

    var soma = 0
    var cont = 1

    while (cont < 11) {
        println("Número $cont: ")
        val num = readInt()
        if (num < 0) {
            println("Por favor, somente passe números inteiros.")
        } else {
            soma += num
            cont++
        }
    }
    cont--
    val media = soma.toDouble() / cont
    println("A média dos 10 número é: $media")
}