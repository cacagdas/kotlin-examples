package functions

fun main() {
    /*
    all infix functions are extension functions,
    but all extensions are not infixes
     */

    // an example to infix functions in kotlin
    5 downTo 1
    5.downTo(1)

    println(5 sum 1)
    println(5.sum(1))

    println("kot" concat "lin")
}

infix fun Int.sum(number: Int): Int = this + number

infix fun String.concat(string: String) = this + string