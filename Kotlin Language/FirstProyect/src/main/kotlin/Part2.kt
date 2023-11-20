import kotlin.random.Random

fun main() {
    println("Starting Part2")

    println("----------")
    write()

    println("----------")
    writeSomething("Hello World!")

    println("----------")
    writeSomethingMore("Hello,", "Daniel")

    println("----------")
    writeSomethingMore("Happy Hunting,")


    println("----------")
    println("getRandomNumber: ${getRandomNumber()}")

    println("----------")
    println("getRandomNumberEasy: ${getRandomNumberEasy()}")

    println("----------")
    println(writeGreetingsWithNull(null, null))

    println("----------")
    println("Ending Part2")
}

fun write(){
    println("Entering function: write()")
}

fun writeSomething(text: String){
    println("Entering the function: writeSomething()")
    println(text)
}

fun writeSomethingMore(greeting: String, name: String = "Rathalos"){
    println("Entering the function writeSomethingMore()")
    println("$greeting $name")
}

fun getRandomNumber(): Int {
    return Random.nextInt()
}

fun getRandomNumberEasy() = Random.nextInt()

fun writeGreetingsWithNull(greeting: String?, name: String?) {
    println("Starting function writeGreetingsWithNull")
    println("${greeting ?: "Greeting was null"}${name ?: "Name was null"}")
}