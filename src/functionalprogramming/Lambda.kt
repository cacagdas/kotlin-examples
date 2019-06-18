package functionalprogramming

fun main() {

    // { parameters -> function body }
    // { a: Int, b: Int -> a * b }

    lambdaHello()
    lambdaSum(2,3)
    lambdaMax(2,4)

    /*
    var lambdaExample: (String, String) -> Unit = { name, lastName->
        println("Name: $name, Lastname: $lastName")
    } */
    var lambdaExample = { name: String, lastName: String ->
        println("Name: $name, Lastname: $lastName")
    }
    lambdaExample("Ali Cagdas", "Colak")

    var list = listOf(1,2,3,4,5)
    // list.forEach { i -> println(i) }
    list.forEach { println(it) } // it stands for iteration
                                // you can use lambda function like this only when it has just one parameter

}

fun hello() {
    println("Hello")
}
var lambdaHello = { println("Hello")}

fun sum(a: Int, b: Int): Int = a + b
val lambdaSum = { a: Int, b: Int -> a + b }

fun max(a: Int, b: Int): Int = if (a > b) a else b
var lambdaMax = { a: Int, b: Int -> if (a > b) a else b }