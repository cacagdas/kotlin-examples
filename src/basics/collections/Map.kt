package collections

// immutable collection

fun main() {

    var map = mapOf<String, Int>("java" to 1, "kotlin" to 2)

    for (key in map.keys) println("key: $key, value: ${map[key]}")
}