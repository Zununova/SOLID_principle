package com.example.solid_principle.princeples.l

// Liskov substitution - подстановки Барбары Лисков


// Не правильно:
open class Bird {
    open fun fly() {

    }
}

class Ostrich() : Bird() {
    override fun fly() {
        throw UnsupportedOperationException("Cant fly")
    }
}

// Правильно:
interface Flyable {
    fun fly()
}

class BirdTwo : Flyable {
    override fun fly() { /*...*/ }
}

class OstrichTwo : Flyable {
    override fun fly() {
        throw UnsupportedOperationException("Ostriches cannot fly")
    }
}
