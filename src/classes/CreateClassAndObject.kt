package classes

fun main() {
    var lamp = Lamp()
}

class Lamp {
    var isOn: Boolean = false

    fun turnOn() {isOn = true}
    fun turnOff() {isOn = false}
}