package com.ctseducare.kotlin.k06_heranca

fun main() {
    val pf = PessoaFisica()
    pf.nome = "Fulano da Silva"
    pf.cpf = "304.349.920-46"
    println("%s, %s".format(pf.nome, pf.cpf))

    val pj = PessoaJuridica()
    pj.nome = "Empresa XYZ Ltda"
    pj.cnpj = "93.064.305/0001-48"
    println("%s, %s".format(pj.nome, pj.cnpj))
}