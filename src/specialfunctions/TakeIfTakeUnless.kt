package specialfunctions

fun main() {

    var person = Person()
    var x = person.takeIf { it is Person }
    var y = person.takeIf { it !is Person } ?: "not a person"
    println(x)
    println(y)

    var p = person.takeUnless { it is Person }
    var q = person.takeUnless { it !is Person }
    println(p)
    println(q)
}