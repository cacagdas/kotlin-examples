package inheritance

fun main() {
    val engineer = Engineer("Cagdas")
    engineer.displayAge(24)
}

abstract class Employee(name: String) {
    init {
        println("Name: $name")
    }

    abstract fun displayAge(age: Int)
}

class Engineer(name: String): Employee(name) {
    override fun displayAge(age: Int) {
        println("Age: $age")
    }
}

// Note: If you inherit an abstract class from an abstract class, you don't need to override methods.