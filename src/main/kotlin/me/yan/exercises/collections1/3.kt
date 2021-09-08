package me.yan.exercises.collections1

import me.yan.exercises.loops.readDouble

/*
    3. Ler um conjunto de números reais, armazenando-o em vetor e calcular o quadrado das componentes deste vetor,
    armazenando o resultado em outro vetor. Os conjuntos têm 10 elementos cada. Imprimir todos os conjuntos.
 */

fun main() {
    val list = mutableListOf<Double>()
    val listSquare = mutableListOf<Double>()

    println("Insira abaixo um conjunto de 10 números reais.")
    for (i in 1..10) {
        print("${i}º número: ")
        val num = readDouble()
        list.add(num)
    }
    println(list)

    for (n in list) {
        listSquare.add(n*n)
    }
    println(listSquare)
}