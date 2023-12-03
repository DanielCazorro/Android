/*
Complementing exercise 2 and using the loops seen so far, create a program in Kotlin that only allows you to establish a life between 0 and 100. If the number does not meet these conditions, you must ask it again
 */

fun main() {
    println(startCharacter(getLife(), "Daniel"))
}

fun getLife() : Int {
    var life: Int?
    do {
        println("Choose your life points. Must be between 0 and 100")
        val input = readLine()
        life = input?.toIntOrNull()

    } while (life == null || life !in 1..100)
    return life
}