package classes

fun main() {
    val calculated: Int = calculateForDays(Days.SUNDAY, 100)
    println(calculated)

    println(Color.RED)
    println(Color.BLUE.rgb)
}

fun calculateForDays(day: Days, value: Int): Int =
    when(day) {
        Days.MONDAY -> value + 1
        Days.TUESDAY -> value + 2
        Days.WEDNESDAY -> value + 3
        Days.THURSDAY -> value + 4
        Days.FRIDAY -> value + 5
        Days.SATURDAY -> value + 6
        Days.SUNDAY -> value + 7
    }

enum class Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}