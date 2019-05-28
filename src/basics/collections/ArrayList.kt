package collections

// mutable collection

fun main() {

    var arrayList = arrayListOf<String>("kotlin", "java")
    //var arrayList = mutableListOf<String>("kotlin", "java")
    arrayList.add("js")
    for (item in arrayList) println(item)
}