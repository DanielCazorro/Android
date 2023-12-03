import kotlin.random.Random

fun main() {
    println("-----ifClassic()-----")
    println("Should be: are not the same")
    ifClassic(1, 2)
    println("Should be: are the same")
    ifClassic(1,1)
    println("-----ifClassicEasy-----")
    println("Should be: are not the same")
    ifClassicEasy(1,2)
    println("Should be: are the same")
    ifClassicEasy(1,1)
    println("-----whenConParametro ------")
    whenWithParam(Random.nextInt(0,5))
    println("-----whenSinParametro ------")
    whenWithoutParam(Random.nextInt(0,5))

    val int = 1
    val float = 1.0f
    println("-----Comparando clases When-----")
    whenComparingClasses(int)
    whenComparingClasses(float)
}

fun ifClassic(number1: Int, number2: Int) {
    if (number1 == number2)
        println("Are the same")
    else
        println("Are not the same")
}

fun ifClassicEasy(number1: Int, number2: Int) =
    if (number1 == number2)
        println("Are the same")
    else
        println("Are not the same")

fun whenWithParam(num: Int) {
    println(num)
    when (num) {
        1 -> {
            println("Soy un uno")
            println("Es mi número favorito")
        }
        2 -> println("Soy un dos")
        3 -> println("Soy un tres")
        4,5 -> println("Soy un cuatro o un cinco")

        else -> println("Soy un número distinto a uno, dos y tres")
    }
}

fun whenWithoutParam(num: Int) {
    println(num)
    when {
        num == 1 -> {
            println("Soy un uno")
            println("Es mi número favorito")
        }
        (num > 1) && (num < 300) -> {
            println("Soy un número mayor que uno")
        }
        else -> println("Soy otro número")
    }
}

fun whenComparingClasses(num: Number) {
    println(num)
    when (num) {
        is Int -> {
            println("Es un entero")
            // Ahora puedo acceder a todos los métodos de los enteros
            num.toFloat()
        }
        is Float -> {
            println("Es un float")
            // Ahora puedo acceder a todos los métodos de los enteros
            num.toInt()
        }
        else -> {
            println("Es otra cosa")
        }
    }
}