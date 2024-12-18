package com.ctseducare.kotlin.k07_listaobjetos

fun main() {

    // Criando uma lista vazia para strings
    var peixes = listOf<String>().toMutableList()

    // Outra maneira de criar uma lista vazia
    var frutas: List<String> = emptyList()

    // Adicionando valores
    peixes.add("Robalo")
    peixes.add("Corvina")
    peixes.add("Bagre")
    peixes.add("Salmão")
    peixes.add("Tilápia")

    // Removendo valor
    peixes.remove("Corvina")

    // Listando conteúdo - método 1
    for (i in 0 until peixes.size) {
        println(peixes[i])
    }
    println("")

    // Listando conteúdo - método 2
    for (peixe in peixes) {
        println(peixe)
    }
    println("")

    // Listando conteúdo - método 3
    peixes.forEach { peixe -> println(peixe) }
    println("")

    // Ordenando ascendente
    peixes.sort()
    peixes.forEach { peixe -> println(peixe) }
    println("")

    // Ordem descendente
    peixes.reverse()
    peixes.forEach { peixe -> println(peixe) }
    println("")

}
