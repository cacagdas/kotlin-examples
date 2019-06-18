package functionalprogramming

fun main() {

    // (Parameter types) -> (Return type)

    call {
        println("Hello")
    }

    /*
    hello("Cagdas", {
        println(it)
    }) */
    hello("Cagdas") {
        println(it)
    }

    foo("kotlin") {
        it.reversed()
    }

    add(2,4) {
        println(it)
    }

    aClass {
        func()
        prop
    }
}

fun call(func: () -> Unit) { // lambda function as parameter
    func()
}

fun hello(name: String, body: (String) -> Unit) {
    body("Hello $name")
}

fun foo(string: String, func: (String) -> String) {
    var x = func(string)
    println(x)
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a + b)
}

class AClass {
    var prop: String? = null
    fun func() = println("AClass func")
}
fun aClass(lambdaFoo: AClass.() -> Unit) {
    var a = AClass()
    a.lambdaFoo()
}