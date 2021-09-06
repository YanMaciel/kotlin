package me.yan.exercises.loops

import kotlin.random.Random

/* Faça um programa que gera um número aleatório de 1 a 1000. O usuário deve tentar acertar qual número
foi gerado, e a cada tentativa o programa deverá informar se o chute é menor ou maior que o número gerado.
O programa acaba quando o usuário acerta o número gerado. O programa deve informar em quantas tentativas o número
foi descoberto. */

fun main() {
    println("Vamos sortear um número de 1 a 1000 e você deverá adivinhar!")
    val randomNum = Random.nextInt(1,1001)
    println("Geramos o número!")
    // println(randomNum)
    var tries = 0

    while (true) {
        print("Tente acertar o número gerado: ")
        val guess = readInt()

        if (guess == randomNum) {
            tries++
            println("Você Acertou!!! É o número $guess e você acertou em $tries tentativas!")
            break
        } else if (guess > randomNum) {
            tries++
            println("O número gerado é menor do que $guess")
        } else if (guess < randomNum) {
            tries++
            println("O número gerado é maior do que $guess")
        }
    }
}