/*
Create a list of several elements using only what we have seen so far and this code:
-val list = listOf("H",1,2,"o",0.2,"l",1.0,"a",0.2,"!")
We carry out a program that:
-Add all the numbers in the list into the same variable (Integers and Doubles) and print it
-Concatenate all Strings into a single String and print it
 */

fun main() {
    val list = listOf("H", 1, 2, "o", 0.2, "l", 1.0, "a", 0.2, "!")

    var totalNumbers = 0.0 // Inicializa la variable para sumar los números
    var totalStrings = "" // Inicializa la variable para concatenar las cadenas

    list.forEach {
        when (it) {
            is Int -> totalNumbers += it // Si es entero, añade a la suma de números
            is Double -> totalNumbers += it // Si es un double, añade a la suma de números
            is String -> totalStrings += it // Si es una cadena, concatena a la cadena total
        }
    }
    println(totalNumbers) // Imprime la suma de números
    println(totalStrings) // Imprime la cadena de cadenas concatenadas
}
