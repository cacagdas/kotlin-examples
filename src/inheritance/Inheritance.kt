package inheritance

fun main() {

    var automobile = Automobile()
    automobile.year = 2019
    automobile.run()
}

open class Vehicle(var color: String? = null, var year: Int? = null) {

    init {
        println("Color: $color")
        println("Year: $year")
    }

    fun run() = println("Vehicle is running")
    fun accelerate() = println("Acceleration")
    fun decelerate() = println("Deceleration")
}

open class WheeledVehicle(var wheel: Boolean = true): Vehicle() {

}

class Automobile: WheeledVehicle() {

}