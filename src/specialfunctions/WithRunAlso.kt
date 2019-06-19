package specialfunctions

fun main() {

    /*
    with
     */
    var person = Person()
    with(person) {
        name = "Cagdas"
        func()
    }

    /*
    run
     */
    val person2 = person.func().run {
        val name = "Ali"
        name
    }
    println(person2)

    /*
    also
     */
    val address = Address("street", 343434)
    val user = User("Cagdas", address)

    val result = user.also { it.age = 24 }
    println(result)
}

class Person {
    var name: String? = null
    fun func() = println("person")
}

data class Address(var street: String? = null, var code: Int? = null)
data class User(var name: String? = null, var address: Address? = null, var age: Int? = null)