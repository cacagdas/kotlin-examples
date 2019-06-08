package classes

open class A {
    protected val b = 2
}

class B: A() {
    fun getBMethod() = b
}

/*
    access only from the same module
    another module in the project (File>New>Module), cannot access this class
 */
internal class InternalClass()