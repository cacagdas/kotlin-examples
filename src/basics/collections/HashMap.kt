package collections

// mutable collection, unsorted data (except mutableMapOf)

fun main() {

    //var hashMap = HashMap<Int, String>()
    //var hashMap = mutableMapOf<Int, String>() // linked hash map, sorted data
    var hashMap = hashMapOf<Int, String>()
    hashMap.put(1, "java")
    hashMap.put(2, "kotlin")

    hashMap.remove(2)
    hashMap.replace(1, "kotlin")

    for (key in hashMap.keys) println("key: $key, value: ${hashMap[key]}")

    println(hashMap[1])
}