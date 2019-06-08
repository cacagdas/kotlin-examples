package classes

/*
    Kotlin has its own getter and setter methods
    even if you do not initialize
 */

fun main() {

    var persona = Persona()
    persona.age = 15
    println("persona age: ${persona.age}")

}

class Persona {

    var type: Int = 0
    get() = field
    set(value) {
        field = value
    }

    var age: Int = 0
    get() = field
    set(value) {
        field = if (value < 18)
            18
        else if (value <= 30)
            value
        else
            value - 3
    }

}