package me.yan.exercises.loops

/* 44. Leia um número inteiro positivo do usuário e então calcule e imprima a sequência Fibonacci até o
primeiro número superior ao número lido. Exemplo: se o usuário informou o número 30, a maior
sequência a ser impressa será: 0 1 1 2 3 5 8 13 21 34 */

fun main() {
    var numL = 0
    var state = true
    var a = 0
    var b = 1
    var c = 0
    val lista = mutableListOf<Int>(0, 1)

    while (state) {
        println("Digite o número limite para calcularmos a sequência Fibonacci:")
        numL = readInt()
        if (numL > 0) state = false
    }

    while (c <= numL) {
        c = a + b
        lista.add(c)
        a = b
        b = c
    }
    print(lista)
}