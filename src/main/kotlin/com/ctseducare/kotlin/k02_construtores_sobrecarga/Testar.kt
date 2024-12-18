package com.ctseducare.kotlin.k02_construtores_sobrecarga

fun main() {

    var aluno1 = Aluno()
    aluno1.nome = "Fulano da Silva"
    if (aluno1.ativo) {
        println("O aluno ${aluno1.nome} esta ativo")
    } else {
        println("O aluno ${aluno1.nome} não esta ativo")
    }

    val aluno2 = Aluno("Beltrano Gomes")
    if (aluno2.ativo) {
        println("O aluno ${aluno2.nome} esta ativo")
    } else {
        println("O aluno ${aluno2.nome} não esta ativo")
    }

}