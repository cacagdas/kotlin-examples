package specialfunctions

fun main() {

    /*
    filter
     */
    var unfilteredList = listOf(0,1,2,3,4,5)
    var list = unfilteredList.filter { it > 3 }
    list.printArray()

    /*
    map
     */
    list = list.map { it * 2 }
    list.printArray()

    /*
    all
     */
    var a = list.all { it > 5 }
    println(a)

    /*
    any
     */
    var b = list.any { it > 9 }
    println(b)

    /*
    count
     */
    var c = list.count { it > 9 }
    println(c)

    /*
    find
     */
    var d = list.find { it > 6 }
    println(d)

}

fun <T> List<T>.printArray() {
    for (item in this) println(item)
}