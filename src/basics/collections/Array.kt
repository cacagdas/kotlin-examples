package collections

// mutable reference variable

fun main() {
    var arr = Array<Int>(5) {0} // all values are initialized as 0
    val array = arrayOf(0,1,2)
    array[0] = 3

    for (items in array) print("$items ")
}