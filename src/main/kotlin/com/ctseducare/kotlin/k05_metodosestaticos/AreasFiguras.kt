package com.ctseducare.kotlin.k05_metodosestaticos

class AreasFiguras {

    companion object {
        fun calcularAreaQuadrado(lado: Float): Float {
            return lado * lado
        }

        fun calcularAreaTriangulo(base: Float, altura: Float): Float {
            return (base * altura) / 2
        }
    }

}