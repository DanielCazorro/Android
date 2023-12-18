fun main() {
    // Ejemplo de uso directo de la función countVowels con un String
    // println(countVowels("Daniel22"))

    // Ejemplo de uso de la extensión countVowels en un String
    val nameDaniel = "Daniel"
    println(nameDaniel.countVowels())

    // Ejemplo adicional usando la extensión
    val sentence = "Kotlin is awesome!"
    println(sentence.countVowels())
}

// Función de extensión para contar vocales en un String
fun String.countVowels() = count { it in listOf('a', 'e', 'i', 'o', 'u') }
