package `object`

fun main() {
    println(MyObject.a)
    println(MyObject.multiple(2,3).toString())

    val someone = object : Someone() {
        override fun develop() {
            println("Will be developed.")
        }
    }

    someone.communicate()
    someone.develop()
}

object MyObject {
    var a: Int = 0

    fun multiple(x: Int, y: Int): Int = x * y
}

open class Someone() {
    fun communicate() = println("Communicating...")

    open fun develop() = println("Developing...")
}