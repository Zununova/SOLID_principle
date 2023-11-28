// Interface Segregation - разделение интерфейсов

// Не правильно:
interface Worker {
    fun work()
    fun eat()
}

class Programmer : Worker {
    override fun work() {

    }
    override fun eat() {

    }
}

// Правильно:
interface Workable {
    fun work()
}

interface Eatable {
    fun eat()
}

class ProgrammerTwo : Workable {
    override fun work() {

    }
}
