import kotlin.random.Random

/*
Create a list that:
-Part 1:
--Creates a "ListRandom" list of 100 elements composed of random numbers between 0 and 9.
--Print the list on screen
-Part 2:
--Creates an empty list "resultList" at whose position...
--Position 0 must count how many 0's there are in the listRandom
--Position 1 you must count how many 1's there are in the Random list.
--etc. with all the numbers
 */

fun main() {
    val listRandom = listRandom() // Genera la lista aleatoria
    val resultList = resultList(listRandom) // Crea la lista de conteo
    println("Lista aleatoria: $listRandom")
    println("Resultado de conteo: $resultList")
}

// Genera una lista aleatoria de 100 elementos entre 0 y 9
fun listRandom(): List<Int> {
    val listRandom = MutableList(100) { Random.nextInt(0, 10) }
    return listRandom
}

// Cuenta la cantidad de ocurrencias de cada número en la lista aleatoria y genera una lista de conteo
fun resultList(listRandom: List<Int>): List<Int> {
    val resultList = MutableList(10) { 0 } // Lista de 10 elementos inicializados en 0
    val counts = listRandom.groupingBy { it }.eachCount() // Cuenta la cantidad de cada elemento

    for ((key, value) in counts) {
        resultList[key] = value // Asigna la cantidad al índice correspondiente en la lista de resultados
    }
    return resultList
}
