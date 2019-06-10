package basics.operators

fun main() {
    var point = Point(3, -2)
    ++point

    println("${point.x}, ${point.y}")
}

class Point(var x: Int = 0, var y: Int = 5) {

    // inc() operator (++) overload
    operator fun inc() = Point(++x, ++y)
}