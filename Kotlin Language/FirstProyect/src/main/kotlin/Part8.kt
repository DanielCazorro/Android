/*
Funciones de Scope
*/

// Variable global de tipo String nullable
var stringNullable: String? = null

fun main() {
    // Ejecuta la lambda proporcionada
    run { println("Hello World") }

    // Ejecuta orEmpty() sobre stringNullable si no es nulo, equivalente a stringNullable.orEmpty()
    stringNullable.run {
        orEmpty()
    }

    // Ejecuta orEmpty() y random() sobre stringNullable si no es nulo, o imprime "I'm null" si es nulo
    stringNullable?.run {
        orEmpty()
        random()
    } ?: run { println("I'm null") }

    // Ejecuta las funciones orEmpty() y random() sobre stringNullable si no es nulo (random está comentado)
    with(stringNullable) {
        orEmpty()
        // random()
    }

    // Ejecuta las funciones orEmpty() y random() sobre stringNullable (random está comentado)
    stringNullable.also {
        it.orEmpty()
        // it.random()
    }

    // Ejecuta las funciones orEmpty() y random() sobre stringNullable si no es nulo (random está comentado)
    stringNullable?.also {
        it.orEmpty()
        it.random()
    }

    // Ejecuta las funciones orEmpty() y random() sobre stringNullable si no es nulo (random está comentado)
    stringNullable.apply {
        orEmpty()
        // random()
    }

    // Ejecuta las funciones orEmpty() y random() sobre stringNullable si no es nulo (random está comentado)
    stringNullable?.apply {
        orEmpty()
        random()
    }
}
