// Función que suma dos strings convertidos a enteros y devuelve la suma como un número decimal
fun sumaStrings(firstString: String, secondString: String) {
    // Convierte los strings a enteros
    val firstInteger = firstString.toInt()
    val secondInteger = secondString.toInt()

    // Realiza la suma de los enteros y la convierte a un número decimal
    val sum = firstInteger + secondInteger
    val doubleSum = sum.toDouble()

    // Imprime el resultado como un número decimal
    return println(doubleSum)
}

// Función que suma dos strings convertidos a enteros y devuelve la suma como un número decimal
fun sumaStringsQuick(firstString: String, secondString: String): Double {
    // Suma los enteros y devuelve el resultado como un número decimal
    return (firstString.toInt() + secondString.toInt()).toDouble()
}

// Función que suma dos strings convertidos a enteros y devuelve la suma como un número decimal
fun sumaStringsEasy(firstString: String, secondString: String) = ((firstString.toInt() + secondString.toInt())).toDouble()

fun main() {
    // Llama a la función sumaStrings para sumar dos strings convertidos a enteros y muestra el resultado
    sumaStrings("1", "2")

    // Llama a la función sumaStringsQuick y muestra el resultado directamente
    println(sumaStringsQuick("1", "8"))

    // Llama a la función sumaStringsEasy y muestra el resultado directamente
    println(sumaStringsEasy("2", "8"))
}
