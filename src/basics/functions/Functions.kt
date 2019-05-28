package functions

fun main() {
    val message: String = "message"
    writeMessage(message)
    getMessage()
    writeMessage(getMessage2("getMessage2"))
    returnUnit()
}

fun writeMessage(message: String) {
    println("Message: $message")
}

fun getMessage(): String {
    return writeMessage("getMessage").toString()
}

fun getMessage2(message: String): String = message

// if there is no return value specified, the return value is Unit
fun returnUnit(): Unit {
    println(writeMessage("writeMessage"))
}
