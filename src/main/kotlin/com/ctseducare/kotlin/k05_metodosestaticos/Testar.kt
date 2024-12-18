package com.ctseducare.kotlin.k05_metodosestaticos

fun main() {
    val areaQuadrado = AreasFiguras.calcularAreaQuadrado(20f)
    println(areaQuadrado)

    val areaTriangulo = AreasFiguras.calcularAreaTriangulo(10f, 5f)
    println(areaTriangulo)
}