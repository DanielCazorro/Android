import kotlin.random.Random

/*
Lambdas
 */

fun main() {
    // Opción 1{ println("Hola") }()
    // Opción 2{ println(" Hola") }.invoke()
    // Dos formas de ejecutar una lambda

    // Creación de una lambda simple
    val lambda1 = { println("Soy lambda1") }

    // Invocación de la lambda directamente
    lambda1.invoke()

    // Llamada a una función que toma una lambda como parámetro
    ejecutarLambda(lambda1)

    // Declaración de una lambda explícita sin parámetros
    val lambda2: () -> Unit = { println("Soy lambda 2") }

    // Declaración de una lambda que devuelve un valor aleatorio
    val lambda3: () -> Int = {
        println("Soy lambda 3")
        Random.nextInt()
    }

    // Declaración de una lambda que multiplica un número por 2
    val lambda4: (Int) -> Int = {
        println("Soy lambda 4")
        it * 2
    }

    // Declaración de una lambda que multiplica un número por 2, utilizando 'it'
    val lambda5: (Int) -> Int = { num ->
        println("Soy lambda 5")
        num * 2
    }

    // Declaración de una lambda que realiza diferentes operaciones dependiendo de la condición
    val lambda6: (Int, Int) -> Int = { num1, num2 ->
        if (num1 > 2) {
            num2 * 1000
        } else {
            println("Soy lambda 6")
            num1 * num2
        }
    }

    // Ejecución e impresión de los resultados de las distintas lambdas
    println(lambda3()) // Imprime un número aleatorio
    println(lambda5(5)) // Imprime el resultado de multiplicar 5 por 2
    println(lambda6(5, 10)) // Imprime el resultado de la lambda condicional
}

// Función que ejecuta una lambda sin parámetros
fun ejecutarLambda(lambda: () -> Unit) {
    lambda.invoke()
}
