package me.yan.exercises.loops

/* 2. Escreva um programa que escreva na tela de 1 a 100, 2 vezes. A primeira vez usando o for e a segunda vez
usando o while. */

fun main() {

    for (n in 1..101) {
        println(n)
    }

    var a = 1

    while (a < 101) {
        print("$a ")
        a++
    }
}