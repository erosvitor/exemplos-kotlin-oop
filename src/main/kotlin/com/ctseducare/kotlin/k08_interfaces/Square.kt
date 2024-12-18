package com.ctseducare.kotlin.k08_interfaces

class Square(val side: Double) : Polygon {
    override fun getArea(): Double {
        return side * side
    }
}