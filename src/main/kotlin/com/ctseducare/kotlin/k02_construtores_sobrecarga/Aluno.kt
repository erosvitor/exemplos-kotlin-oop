package com.ctseducare.kotlin.k02_construtores_sobrecarga

class Aluno {

    var nome = ""
    var ativo: Boolean

    constructor() {
        this.ativo = true
    }

    constructor(nome: String) {
        this.nome = nome
        this.ativo = true
    }

}