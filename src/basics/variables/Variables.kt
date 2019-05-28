package variables

/**
 * created by cacagdas.
 */

fun main() {

    var name = "Cagdas" // changeable
    println(name)

    name = "Ali"
    println(name)

    val count = 23 // final value
    println(count)

    // declaring the type of the variable
    var int: Int = 34
    var long: Long = 3434
    var double: Double = 34.34
    var float: Float = 34.34F
    var bool: Boolean = false
    var str: String = "string"


    // creating nullable variables
    var a: String? = null

    // null safe call
    var b: String? = "Kotlin"
    println(b?.length)

    // when you think that null check is unnecessary
    val c = a!!.length // NullPointerEx is throwable here

    // print variable in String
    var lesson: String = "Kotlin"
    println("$lesson Lessons")
    println("${lesson.length} length")

    // init variable using if/else
    var d = 1
    var e = 2
    var max = if (d > e) d else e
}