git/*
Complementing exercise 2 and using the loops seen so far, create a program in Kotlin that only allows
you to establish a life between 0 and 100. If the number does not meet these conditions, you must ask it again
 */

fun main() {
    // Llama a la función startCharacter con la vida establecida por el usuario y un nombre fijo
    println(startCharacter(getLife(), "Daniel"))
}

// Función para obtener el valor de vida del usuario entre 0 y 100
fun getLife(): Int {
    var life: Int?
    do {
        println("Choose your life points. Must be between 0 and 100")
        val input = readLine()
        life = input?.toIntOrNull()

    } while (life == null || life !in 0..100) // Repite hasta que se introduzca un valor válido
    return life // Devuelve la vida válida introducida por el usuario
}
