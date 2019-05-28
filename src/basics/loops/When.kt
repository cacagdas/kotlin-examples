package loops

fun main() {

    // when (it is like switch/case)
    var condition = 1
    when(condition){
        1 -> println("1")
        else -> println("another")
    }

    var result = when(condition) {
        0,1 -> true
        else -> false
    }
    println(result)

    when (condition) {
        in 1..10 -> println("1..10")
    }
}
