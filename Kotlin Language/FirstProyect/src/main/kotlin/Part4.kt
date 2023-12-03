import kotlin.random.Random

/*
Bucles
 */

fun main() {

    // Repetición utilizando repeat
    repeat(10) {
        println("Estoy en la repetición $it")
    }

    // Repeat con un número aleatorio
    repeat(10) { numeroRepeticion ->
        println("Estoy en la repetición $numeroRepeticion y pongo un número aleatorio = ${Random.nextInt(0, 10)}")
    }

    var numRepeticion = 8

    // Ejemplo de uso del while
    // El while no siempre ejecuta el contenido si la condición no se cumple al inicio
    while (numRepeticion < 10) {
        println("Estoy en la repetición del While número $numRepeticion")
        numRepeticion++
    }

    numRepeticion = 10

    // Ejemplo de uso del do-while
    // El do-while siempre se ejecuta al menos una vez
    do {
        println("Estoy en la repetición del Do-While número $numRepeticion")
        numRepeticion++
    } while (numRepeticion < 10)

    // Ejemplo de uso del do-while con entrada del usuario
    do {
        println("Escribe un número para salir de este bucle")
        val texto = readLine()
        val num = texto?.toIntOrNull()
    } while (num == null)
}
