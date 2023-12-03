/*

Transform the following functions into Lambdas and run them.

- fun lambda1() {println("This Lambda writes: Hello")}
- fun lambda2(integer: Int) { println("This Lambda receives an Int and writes it: $integer")}
- fun exercise3(position :Int, list: List<Any>) { println("This Lambda receives an Int and a List. Write to the element at position ${list[position]}")}
 */

fun main() {
    val lambda1 = { println("This Lambda writes: Hello") }

    println("----------")
    lambda1()

    val lambda2: (Int) -> Unit = { integer ->
        println("This Lambda receives an Int and writes it: $integer")
    }


    println("----------")
    lambda2(8)

    val lambda3: (Int, List<Any>) -> Unit  = { position, list ->
        println("This Lambda receives an Int and a List. Writes the element at position $position: ${list[position]}")
    }

    println("----------")
    val myList = listOf(0, "Yes") // Crear la lista antes de llamar a lambda3
    lambda3(1, myList)
}