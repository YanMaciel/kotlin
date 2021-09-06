package me.yan.exercises.loops

/* 5. Faça um programa que peça ao usuário para digitar 10 valores e some-os. */

fun main() {
    println("Digite 10 valores inteiros para somarmos: ")

    var soma = 0
    var cont = 1

    while (cont < 11) {
        println("Número $cont: ")
        var num = readInt()

        soma += num
        cont++
    }
    println(soma)
}