package com.ctseducare.kotlin.k08_interfaces

class Rectangle(val length: Double, val breadth: Double) : Polygon {
    override fun getArea(): Double {
        return length * breadth
    }
}
