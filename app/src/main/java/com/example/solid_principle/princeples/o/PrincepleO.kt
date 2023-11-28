package com.example.solid_principle.princeples.o

// Open-closed - Открытость-закрытость

// Не правильно:
class Rectangle {
    var width: Int = 0
    var height: Int = 0
}

// Правильно:
interface Shape {
    fun area(): Int
}

class RectangleTwo(val width: Int, val height: Int) : Shape {
    override fun area(): Int = width * height
}

class Circle(val radius: Int) : Shape {
    override fun area(): Int = (Math.PI * radius * radius).toInt()
}
