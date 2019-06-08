package classes

fun main() {
    var lamp = Lamp()
    lamp.isOn = true
    lamp.turnOff()


    // Car class
    var car = Car()
    car.color = "black"
    car.year = 2019
    car.run()
}

class Lamp {
    var isOn: Boolean = false

    fun turnOn() {isOn = true}
    fun turnOff() {isOn = false}
}