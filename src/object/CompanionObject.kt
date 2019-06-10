package `object`

fun main() {
    val user = User()
    user.func()
    println(user.name)

    // companion (no need to create object of the class, this provides singleton pattern architecture)
    println(User.age)
    User.cmpFunc()
}

class User {
    var name: String? = null

    companion object {
        var age: Int = 24
        fun cmpFunc() = println("companion func")
    }

    fun func() = println("func")
}