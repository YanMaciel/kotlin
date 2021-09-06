package me.yan.exercises.loops

/* 17. Faça um programa que leia um número inteiro positivo n e calcule a soma dos
n primeiros números naturais. */

fun main() {

    var state = true
    var soma = 0
    var lim = 0

    while (state) {
        println("Digite um número inteiro positivo:")
        lim = readInt()
        if (lim > 0) {
            for (num in 0..lim) {
                soma += num
            }
            state = false
        }
    }
    println("A soma dos números de 0 até $lim é de: $soma.")
}
