package inheritance

fun main() {
    val z = Z()
    z.write()
    println(z.prop)
}

interface X {
    fun write() = println("X")
    var prop: String
}

interface T {
    fun tFunc()
}

interface Y: T {
    fun write() = println("Y")
}

interface B {
    interface C {
        fun cFunc()
    }
}

class Z: X, Y, B.C {
    override var prop: String = "prop"

    override fun write() {
        super<X>.write()
        super<Y>.write()
    }

    override fun tFunc() {
    }

    override fun cFunc() {
    }

}