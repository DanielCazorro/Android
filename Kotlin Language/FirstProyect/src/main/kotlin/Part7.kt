/*
Let
*/

// Variable global de tipo String nullable
var stringNullable2: String? = "Hello World"

fun main() {
    // Lectura de entrada
    val stringNullable1 = readLine()

    // Imprime un carácter aleatorio de la entrada si es no nula
    println(stringNullable1?.random())

    // Lógica usando la entrada si no es nula
    if (stringNullable1 != null) {
        println(stringNullable1.random())
        writeCharacter(stringNullable1.random())
    }

    // No se puede ejecutar este bloque debido a la posibilidad de modificación de la variable externa
    // if (stringNullable2 != null) {
    //     println(stringNullable2.random())
    //     writeCharacter(stringNullable2.random())
    // }

    // Uso de let con stringNullable2
    stringNullable2?.let {
        println(it.random())
        writeCharacter(it.random())
    }
}

// Función que escribe un carácter
fun writeCharacter(character: Char) {
    println(character)
}