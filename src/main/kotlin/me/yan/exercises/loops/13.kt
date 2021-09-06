package me.yan.exercises.loops

/* 13. Faça um programa que leia um número inteiro positivo par N e imprima todos os números pares de 0 até N
em ordem crescente. */

fun main() {

    var state = true
    while (state) {
        println("Digite um número par: ")
        val num = readInt()
        if (num % 2 == 0) {
            println("Os números pares de 0 até $num são:")
            for (n in 0..num+1 step 2){
                println(n)
            }
            state = false
        }
    }
}