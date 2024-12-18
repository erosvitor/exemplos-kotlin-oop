package com.ctseducare.kotlin.k04_encapsulamento

fun main() {

    val livro = Livro()
    livro.titulo = "Livro ABC"
    livro.anoLancamento = 2022
    livro.avaliacao = 4

    println(livro.titulo)
    println(livro.anoLancamento)
    println(livro.avaliacao)

}