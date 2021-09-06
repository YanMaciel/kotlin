package me.yan.exercises.loops

import java.lang.NumberFormatException

/* 8. Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido. */

fun main() {

    println("Digite 10 números para checarmos qual é o maior e o menor!")
    val numeros: MutableList<Double> = mutableListOf()
    var cont = 1

    while (cont < 11) {
        println("${cont}º: ")

        val num = readDouble()
        if (num < 0) {
            println("Por favor, somente passe números inteiros.")
        } else {
            numeros.add(num)
            cont++
        }
    }
    println("O menor valor lido é ${numeros.minOrNull()}")
    println("O maior valor lido é ${numeros.maxOrNull()}")
}