package me.yan.exercises.collections1

import me.yan.exercises.loops.readInt

/*
    34. Faça um programa para ler 5 números DIFERENTES a serem armazenados em um vetor. Os dados deverão ser armazenados
    no vetor na ordem que forem lidos, sendo que caso o usuário digite um número que já foi digitado anteriormente, o
    programa deverá pedir para ele digitar outro número. Note que cada valor digitado pelo usuário deve ser pesquisado
    no vetor, verificando se ele existe entre os números que já foram fornecidos. Exibir na tela o vetor final que foi
    digitado.
*/

fun main() {
    val vector = mutableListOf<Int>()

    println("Digite 5 números inteiros diferentes para compor seu vetor.")
    for (i in 1..5) {
        print("${i}º número: ")
        var num = readInt()
        while (true) {
            if (num in vector) {
                print("Número já digitado. Insira outro número: ")
                num = readInt()
            } else {
                vector.add(num)
                break
            }
        }
    }
    println(vector)
}