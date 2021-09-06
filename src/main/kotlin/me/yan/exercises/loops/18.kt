package me.yan.exercises.loops

/* 18. Escreva um algoritmo que leia certa quantidade de números e imprima o maior deles e
quantas vezes o maior número foi lido. A quantidade de números a serem lidos deve ser fornecida
pelo ususário. */

fun main() {

    var qtd = 0
    var maior = Int.MIN_VALUE
    var contMaior = 0
    var state = true
    while (state) {
        println("Quantos números você quer testar?")
        qtd = readInt()
        if (qtd > 0) state = false
    }

    for (n in 1..qtd) {
        println("Insira o ${n}º número: ")
        val num = readInt()
        if (num > maior) {
            maior = num
            contMaior = 1
        } else if (num == maior) contMaior++
    }

    println("O maior número da sequência é $maior e ele foi inserido $contMaior vezes!")
}