package specialfunctions

fun main() {

    /*
    let (check if the parameter null or not)
     */
    var string: String? = "Kotlin"
    string?.let {
        // not null
        println("not null")
    } ?: println("null") // null

    val result = string?.let {
        println(it)
        5
    }
    println(result)


    /*
    apply
     */
    val task = Runnable { println("running") }
    val thread = Thread(task)
    thread.isDaemon = true
    thread.name = "thread"
    thread.state
    thread.start()

    val task2 = Runnable { println("running 2") }
    val thread2 = Thread(task2)
    thread2.apply {
        isDaemon = true
        name = "thread2"
        state
        start()
    }

    /*
    repeat
     */
    repeat(5) { println("repeat") }
}