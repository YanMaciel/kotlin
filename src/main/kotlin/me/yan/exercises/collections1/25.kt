package me.yan.exercises.collections1

/*
    25. Faça um programa que preencha um vetor tamanho 100 com os 100 primeiros naturais que são múltiplos de 7
    ou que terminam com 7.
*/

fun main() {
    val vector = mutableListOf<Int>()
    var count = 0

    for (i in 1..Int.MAX_VALUE) {
        if (count == 100) break
        if (i % 7 == 0 || i % 10 == 7) {
            vector.add(i)
            count++
        }
    }
    println(vector)
}