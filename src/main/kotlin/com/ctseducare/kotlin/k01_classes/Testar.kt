package com.ctseducare.kotlin.k01_classes

fun main() {

    val carro1 = Carro()
    carro1.marca = "Ford"
    carro1.modelo = "Fusion"
    carro1.cor = "Preta"
    carro1.capacidadeTanque = 55F
    carro1.kmPorLitro = 8F

    val autonomia = carro1.calcularAutonomia()
    println("Autonomia do carro ${carro1.modelo} é de $autonomia")

    val quilometragem = 400f
    val qtdeCombustivel = carro1.calcularCombustivel(quilometragem)
    println("Para uma viagem de $quilometragem km, são necessários $qtdeCombustivel litros de combustível")

}