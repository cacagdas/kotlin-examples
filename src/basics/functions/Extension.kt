package functions

fun main() {

    println(5.square())

    val kotlin: String = "kotlin"

    println(kotlin.reversed()) // extension function in kotlin to reverse the string
}

fun Int.square() = this * this