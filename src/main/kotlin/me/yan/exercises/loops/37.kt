package me.yan.exercises.loops

/* 37. Escreva um programa que verifique quais números entre 1000 e 9999 (inclusive) possuem a seguinte
propriedade: a soma dos dois dígitos de mais baixa ordem com os dois dígitos de mais alta ordem elevada
ao quadrado é igual ao prórpio número. Por exemplo, para o inteiro 3025, temos que:
30 + 25 = 55
55² = 3025
 */

fun main() {
    for (num in 1000..9999) {
        val numString = num.toString()
        val firstTwo = ("${numString[0]}${numString[1]}").toInt()
        val lastTwo = ("${numString[2]}${numString[3]}").toInt()
        val mathProp = (firstTwo + lastTwo) * (firstTwo + lastTwo)

        if (mathProp == num) println(num)
    }
}

