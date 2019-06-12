package classes.generic

fun main() {

    var input = Input<Int>()
    input.inputFunction(3)

    var input2 = Input<Boolean>()
    input2.inputFunction(false)


    var output = Output<String, Boolean>()
    output.outputFunction("string", false)
}

class Input<T> { // T refers for Type here, you can write any other letter

    // var a: String? = null // String type variable
    var a: T? = null // generic type variable

    fun inputFunction(a: T) {
        this.a = a
        println("input: $a")
    }

    fun get(): T? = this.a
}

class Output<T, K> { // can take more than one type

    var t: T? = null
    var k: K? = null

    fun outputFunction(t: T, k: K) {
        this.t = t
        this.k = k

        println("output: $t, $k")
    }
}