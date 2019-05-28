package loops

fun main() {

    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    do {
        println(i)
        i++
    } while (i < 11)

    var user: String
    var pass: String
    do {
        println("user: ")
        user = readLine().toString()

        println("pass: ")
        pass = readLine().toString()
    } while (!user.equals(pass))

    var value: Int?
    while (true) { // infinite loop
        println("value: ")
        value = readLine()?.toInt()
        if (value == 0) break
        else if (value == 1) continue
        else println("value: $value")
    }
}