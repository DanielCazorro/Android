fun main() {
    // Clase regular Class1
    val class1 = Class1("Anthony", "Stark")
    val class2 = Class1("Anthony", "Stark")
    // La comparación en clases regulares es por referencia, no por valores.
    // Dado que son objetos diferentes, el resultado será "Not the same"
    if (class1 == class2) println("Are the same") else println("Not the same")

    // Data Class DataClass1
    val dataClass1 = DataClass1("Anthony", "Stark")
    val dataClass2 = DataClass1("Anthony", "Stark")
    // Las data classes comparan por igualdad estructural, no por referencia.
    // Dado que los valores son iguales, el resultado será "Are the same"
    if (dataClass1 == dataClass2) println("Are the same") else println("Not the same")

    // Copiando una instancia de DataClass1 usando la función copy()
    val dataClass3 = dataClass1.copy()
    // Modificando el nombre de la copia
    dataClass3.name = "John"
    println(dataClass3) // Imprime "DataClass1(name=John, surname=Stark)"
    println(dataClass1) // Imprime "DataClass1(name=Anthony, surname=Stark)"
}

// Clase regular Class1
class Class1(var name: String, var surname: String)

// Data Class DataClass1
// Una data class automáticamente proporciona métodos equals(), hashCode(), toString() y copy()
data class DataClass1(var name: String, var surname: String)
