package com.ctseducare.kotlin.k04_encapsulamento

class Livro {

    var titulo = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var anoLancamento = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var avaliacao = 0
        get() {
            if (field < 5) println("Atenção! Este livro é péssimo")
            return field
        }
        set(value) {
            field = when {
                value > 10 -> 10
                value < 0 -> 0
                else -> value
            }
        }
}