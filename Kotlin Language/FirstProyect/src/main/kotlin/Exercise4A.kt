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
    val listRandom = listRandom()
    val resultList = resultList(listRandom)
    println("Lista aleatoria: $listRandom")
    println("Resultado de conteo: $resultList")
}

fun listRandom(): List<Int> {
    val listRandom = mutableListOf<Int>()
    repeat(100) {
        listRandom.add(Random.nextInt(0, 10))
    }
    return listRandom
}

/*
fun listRandom() {
    var index = 0
    val listRandom = mutableListOf<Int>()
    do {
        listRandom.add(Random.nextInt(0, 9))
        index++
    } while (index < 100)
    println(listRandom.count())
    println(listRandom)
}
*/
fun resultList(listRandom: List<Int>): List<Int> {
    val resultList = MutableList(10) { 0 } // Lista de 10 elementos inicializados en 0
    val counts = listRandom.groupingBy { it }.eachCount()

    for ((key, value) in counts) {
        resultList[key] = value
    }
    return resultList
}
