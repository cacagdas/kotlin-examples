package classes.generic

fun main() {

    var array = arrayOf(1,2,3,4,5)
    var array2 = arrayOf("Kotlin", "Java")
    var array3 = arrayOf(false, true, true, false)

    printArray(array)
    printArray(array2)
    printArray(array3)

    array.printArrayExtension()
    array2.printArrayExtension()
    array3.printArrayExtension()

    var max = getMaximum(1.2,2.3,3.4)
    println("max: $max ")
}

fun <T> printArray(array: Array<T>) {
    for (item in array) println(item)
}

fun <T> Array<T>.printArrayExtension() {
    for (item in this) println(item)
}

fun <T: Comparable<T>> getMaximum(x: T, y: T, z: T): T {
    var max = x

    if (y.compareTo(max) > 0) max = y

    if (z.compareTo(max) > 0) max = z

    return max
}