package com.ctseducare.kotlin.k01_classes

class Carro {

    var marca = ""
    var modelo = ""
    var cor = ""
    var capacidadeTanque = 0.0f
    var kmPorLitro = 0.0f

    fun calcularAutonomia(): Float {
        return this.capacidadeTanque * this.kmPorLitro
    }

    fun calcularCombustivel(km: Float): Float {
        return km / kmPorLitro
    }

}
