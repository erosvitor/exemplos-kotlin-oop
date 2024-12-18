package com.ctseducare.kotlin.k03_sobrecarga

class FigurasPlanas {

    fun calcularAreaQuadrado(lado: Int): Int {
        return lado * lado
    }

    fun calcularAreaQuadrado(lado: Float): Float {
        return lado * lado
    }

    fun calcularAreaCirculo(raio: Float): Float {
        return 3.14f * (raio * raio)
    }

    fun calcularAreaCirculo(raio: Float, pi: Float): Float {
        return pi * (raio * raio)
    }

}
