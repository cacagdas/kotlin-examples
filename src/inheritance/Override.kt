package inheritance

fun main() {
    var female = Female()
    female.writeGender()

    female.name = null
    println("Name: ${female.name}")
}

open class Gender() {
    open fun writeGender() {
        println("Gender: not specified")
    }

    open var name: String? = null
    get() = field
    set(value) {field = value}
}

class Female: Gender() {
    override fun writeGender() {
        println("Gender: female")

        super.writeGender() // runs upper class method, too
    }

    override var name: String? = null
        //get() = super.name --> gets property from upper class
        get() = field
        set(value) {
            field = if (value == null) "No Name" else value
        }
}