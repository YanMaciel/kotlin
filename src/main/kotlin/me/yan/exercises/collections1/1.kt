package me.yan.exercises.collections1

/*
    1. Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O Programa deve executar os
    seguintes passos:

        a. Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, 5, 7.
        b. Armazene em uma variável inteira (simples) a soma entre os valores das posições 0, 1 e 5 do vetor e mostre
        na tela esta soma.
        c. Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
        d. Mostre na tela cada valor do vetor A, um em cada linha.
 */

fun main() {
    var vetorA = mutableListOf<Int>()
    vetorA.addAll(arrayOf(1, 0, 5, -2, 5, 7))
    println(vetorA)
    val soma = vetorA[0] + vetorA[1] + vetorA[5]
    println(soma)
    vetorA[4] = 100
    println(vetorA)
}