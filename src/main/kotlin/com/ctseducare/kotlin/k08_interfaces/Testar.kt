package com.ctseducare.kotlin.k08_interfaces

fun main() {
    val s1:Polygon = Square(4.0)
    val r1:Polygon = Rectangle(5.0, 7.0)

    val polygons = listOf(s1, r1)

    for (polygon in polygons) {
        println(polygon.getArea())
    }
}
