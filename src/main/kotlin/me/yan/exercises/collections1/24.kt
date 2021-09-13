package me.yan.exercises.collections1

import me.yan.exercises.loops.readDouble
import me.yan.exercises.loops.readInt

/*
    24. Faça um programa que leia 5 conjuntos de dois valores, o primeiro representando o número do aluno e o segundo
    representando a sua altura em metros. Encontre o aluno mais baixo e o mais alto. Mostre o número do aluno mais
    baixo e do mais alto, juntamente com suas alturas.
*/

fun main() {
    data class Aluno(val id: Int, val altura: Double)
    val alunos = mutableListOf<Aluno>()
    var maisAlto = Aluno(id = Int.MIN_VALUE, altura = Double.MIN_VALUE)
    var maisBaixo = Aluno(id = Int.MIN_VALUE, altura = Double.MAX_VALUE)

    println("Insira o identificador e a altura de 5 alunos.")
    for (i in 1..5) {
        print("Id do ${i}º aluno: ")
        val id = readInt()
        print("Altura do ${i}º aluno: ")
        val altura = readDouble()
        val novoAluno = Aluno(id = id, altura = altura)
        alunos.add(novoAluno)
    }

    for (aluno in alunos) {
        if (aluno.altura > maisAlto.altura) maisAlto = aluno
        if (aluno.altura < maisBaixo.altura) maisBaixo = aluno
    }

    println("O aluno mais alto tem registro nº ${maisAlto.id} e possui ${maisAlto.altura}m de altura.")
    println("O aluno mais baixo tem registro nº ${maisBaixo.id} e possui ${maisBaixo.altura}m de altura.")
}