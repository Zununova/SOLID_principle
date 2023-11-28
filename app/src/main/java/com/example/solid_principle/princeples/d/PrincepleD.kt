package com.example.solid_principle.princeples.d

// Dependency inversion - инверсия зависимости

// Не правильно:
class LightSwitch {
    private val bulb = Bulb()

    fun turnOn() {
        bulb.turnOn()
    }

    fun turnOff() {
        bulb.turnOff()
    }
}

class Bulb {
    fun turnOn() { /*...*/ }
    fun turnOff() { /*...*/ }
}

// Правильно :
interface Switchable {
    fun turnOn()
    fun turnOff()
}

class LightSwitchTwo(private val device: Switchable) {
    fun turnOn() {
        device.turnOn()
    }

    fun turnOff() {
        device.turnOff()
    }
}

class BulbTwo : Switchable {
    override fun turnOn() { /*...*/ }
    override fun turnOff() { /*...*/ }
}
