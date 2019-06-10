package classes

// special to kotlin. there is no constructor, getters and setters etc. as in java

fun main() {
    val human1 = Human("Cagdas", 24)
    println("name: ${human1.name}, age: ${human1.age}")

    // component getter methods:
    println("name: ${human1.component1()}, age: ${human1.component2()}")

    // copy method
    val human2 = human1.copy()
    println(human2)

    val human3 = human1.copy("Ali")
    println(human3.toString())

    // hashcode
    println("human1 hashcode = ${human1.hashCode()}")
    println("human2 hashcode = ${human2.hashCode()}")
    println("human3 hashcode = ${human3.hashCode()}")

    // equals
    if (human1.equals(human2)) println("human1 equals human2")
    else println("human1 not equals human2")
}

data class Human(var name: String, var age: Int)