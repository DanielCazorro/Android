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