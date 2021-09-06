package me.yan.exercises.loops

/* 35. Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
O programa deve somar os números ímpares contidos nesse intervalo. Caso o usuário digite um intervalo
inválido (inicial > final) deve ser escrito uma mensagem de erro na tela e o programa termina. */

fun main() {
    var soma = 0
    println("Digite o valor inicial do intervalo: ")
    val inicial = readInt()
    println("Digite o valor final do intervalo: ")
    val final = readInt()

    if (inicial >= final) println("Erro: Intervalo inválido")
    else {
        for (num in inicial..final) {
            if (num % 2 > 0) soma += num
        }
        println("A soma dos valores ímpares de $inicial até $final é de $soma")
    }
}