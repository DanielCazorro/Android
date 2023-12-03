import kotlin.random.Random

/*
Lambdas
 */

fun main() {
    // Opción 1{ println("Hola") }()
    // Opción 2{ println(" Hola") }.invoke()
    val lambda1 = { println("Soy lambda1") }

    lambda1.invoke()
    ejecutarLambda(lambda1)

    val lambda2: () -> Unit = { println("Soy lambda 2") }

    val lambda3: () -> Int = {
        println("Soy lambda 3")
        Random.nextInt()
    }

    // Esta lambda va a devolver el número multiplicado por 2
    val lambda4: (Int) -> Int = {
        println("Soy lambda 4")
        it * 2
    }

    val lambda5: (Int) -> Int = {num ->
        println("Soy lambda 5")
        num * 2
    }

    // Esta lambda simplement multiplica los 2 números que les pases
    val lambda6: (Int, Int)-> Int = { num1, num2 ->
        if (num1 > 2) {
            num2 * 1000
        } else {
            println("Soy lambda 5")
            num1 * num2
        }

    }

    println(lambda3())
    println(lambda5(5))
    println(lambda6(5, 10))
}

fun ejecutarLambda(lambda: () -> Unit) {
    lambda.invoke()
}