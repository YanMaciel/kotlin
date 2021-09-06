package me.yan.exercises.loops

/* 3. Faça um algoritmo utilizando o comando while que mostra uma contagem regressiva
na tela, iniciando em 10 e terminando em 0. Mostrar uma mensagem "FIM!" após a contagem. */

fun main() {
    var a = 10

    while (a > -1) {
        println(a)
        a--
    }
    println("FIM!")
}