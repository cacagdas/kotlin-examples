package collections

// immutable collection

fun main() {

    var list = listOf<String>("kotlin", "java")

    for (item in list) println(item)
    for (i in 0 until list.size) println(list[i])

    /*
    i until j = i..j ,
                i range to j
     */
}