package classes.generic

fun main() {

    var myClass = MyClass<SecondClass>()
    myClass.myFunc(SecondClass())
}

open class FirstClass {
    fun first() {}
}

class SecondClass: FirstClass() {
    fun second() {}
}

class MyClass<T: FirstClass> { // can get type of FirstClass and/or its subclasses only

    fun myFunc(t: T) {}

}


/* generic type used as return value -> "out" word
    cannot be use as parameter when you use "out" word
 */
class Producer<out T>(val value: T) {
    fun get(): T = value
}

/* generic type used as parameter -> "in" word
    cannot be use as return value when you use "in" word
 */
class Consumer<in S> {
    fun toString(value: S): String {
        return value.toString()
    }
}