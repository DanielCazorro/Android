/*
Arrays and list
 */

fun main() {
    arrays()
    listas()

}

fun listas() {
    val lista = listOf("A", "B", "C")
    lista.forEach {
        println(it)
    }
    
    lista.forEachIndexed { posicion, item ->
        println("En la posición $posicion tengo al item $item")
    }

    val mutableList = mutableListOf("A", "B", "C")
    mutableList.add("D")
    mutableList.remove("A")
    mutableList.removeAt(1)

    var lista2 = listOf("1","2","3","4")
    lista2.forEach { println(it) }
    lista2 = lista
    lista2.forEach { println(it) }

    var mutableList2 = mutableListOf("1", "2", "3", "4")
    mutableList2.forEach { println(it) }
    mutableList2 = mutableList
    mutableList2.forEach { println(it) }
}

fun arrays() {
    val array1 = arrayOf("A", "B", "C")
    array1.forEach {
        println(it)
    }
    array1.forEachIndexed { indice, item ->
        println("En la posicion $indice tengo al item $item")
    }


    val array2 = Array(3) {
        println("Estoy en la pos $it")
        "Hola$it"
    }
    array2.forEach { item ->
        println(item)
    }
}