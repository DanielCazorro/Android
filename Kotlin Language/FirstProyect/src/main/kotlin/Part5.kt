/*
Arrays and list
 */

fun main() {
    arrays()
    listas()
}

fun listas() {
    // Lista inmutable
    val lista = listOf("A", "B", "C")

    // Itera sobre la lista e imprime cada elemento
    lista.forEach {
        println(it)
    }

    // Itera sobre la lista con índices e imprime la posición y el elemento
    lista.forEachIndexed { posicion, item ->
        println("En la posición $posicion tengo al item $item")
    }

    // Lista mutable
    val mutableList = mutableListOf("A", "B", "C")

    // Agrega un elemento al final de la lista
    mutableList.add("D")

    // Elimina un elemento específico de la lista
    mutableList.remove("A")

    // Elimina un elemento en una posición específica de la lista
    mutableList.removeAt(1)

    // Creación de una nueva lista y asignación de valores
    var lista2 = listOf("1","2","3","4")
    lista2.forEach { println(it) }

    // Asignación de una lista existente a otra variable y se imprime la lista asignada
    lista2 = lista
    lista2.forEach { println(it) }

    // Lista mutable con valores asignados
    var mutableList2 = mutableListOf("1", "2", "3", "4")
    mutableList2.forEach { println(it) }

    // Asignación de una lista mutable existente a otra variable y se imprime la lista asignada
    mutableList2 = mutableList
    mutableList2.forEach { println(it) }
}

fun arrays() {
    // Array inmutable
    val array1 = arrayOf("A", "B", "C")

    // Itera sobre el array e imprime cada elemento
    array1.forEach {
        println(it)
    }

    // Itera sobre el array con índices e imprime la posición y el elemento
    array1.forEachIndexed { indice, item ->
        println("En la posición $indice tengo al item $item")
    }

    // Creación de un array mutable con valores asignados dinámicamente
    val array2 = Array(3) {
        println("Estoy en la pos $it")
        "Hola$it"
    }

    // Itera sobre el nuevo array e imprime cada elemento
    array2.forEach { item ->
        println(item)
    }
}
