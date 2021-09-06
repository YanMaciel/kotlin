package me.yan.exercises.loops

/* 4. Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o
de 1000 em 1000, imprimindo seu valor na tela, até que seja igual a 100.000 (cem mil). */

fun main() {
    for (n in 0..100001 step 1000) {
        println(n)
    }
}