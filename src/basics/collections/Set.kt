package collections

fun main() {

    // immutable
    var set = setOf<Int>(1,1,2,2,3,3)
    println(set.size) // prints 3 because multiplicity is being ignored in "set" data structure

    // mutable
    var hashSet = hashSetOf<Int>(1,1,2,2,3,3)
    var mutableSet = mutableSetOf<Int>(1,1,2,2,3,3)
    mutableSet.add(4)
    mutableSet.add(4)
    mutableSet.remove(3)

    for (item in hashSet) println(item)
    println()
    for (item in mutableSet) println(item)
}