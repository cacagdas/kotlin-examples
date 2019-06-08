package classes

fun main() {

    var person = Person("Cagdas", 24)
    var employee = Employee("Cagdas", 1)
    var player = Player("Cagdas", 0)
    var student = Student("Cagdas")
    var student2 = Student(number = 12)

    var user = User("cagdas", 24)
}

// constructor
class Person {
    var name: String? = null
    var age: Int? = null

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

// primary constructor
class Employee(name: String, id: Int) {
    var name: String? = name
    var id: Int? = id
}

class Player(var name: String, var number: Int)

class Student(var name: String? = null, var number: Int = 0)

// init
class User(var userName: String, userAge: Int) {
    var name: String? = null
    var age: Int? = null

    init {
        name = userName.capitalize()
        age = userAge

        println("Name: $name")
        println("Age: $age")
    }
}