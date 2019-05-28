package loops

fun main() {

    for (i in 1..5) println(i)
    for (i in 5 downTo 1) println(i)

    (0..10).forEach { i -> print("$i ");  }

    firstLoop@ for (i in 1..4) {
        secondLoop@ for (j in 1..3) {
            if (i == 2) continue@firstLoop
            if (i == 4) break@firstLoop
            println("i = $i; j = $j")
        }
    }
}