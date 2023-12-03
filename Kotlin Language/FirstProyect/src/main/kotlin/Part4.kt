import kotlin.random.Random

/*
Bucles
 */

fun main() {

   repeat(10) {
       println("Estoy en la repetición $it")
   }

    repeat(10) { numeroRepeticion ->
        println("Estoy en la repetición $numeroRepeticion y pongo un número aleatorio = ${Random.nextInt(0, 10)}")
    }

    var numRepeticion = 8
    // El while no siempre se ejecuta el contenido
    while (numRepeticion < 10) {
        println("Estoy en la repetición del While número $numRepeticion")
        // numRepeticion += 1
        numRepeticion++
    }

    numRepeticion = 10
    // El do while siempre se ejecuta al menos uan vez
    do {
        println("Estoy en la repetición del Do-While número $numRepeticion")
        numRepeticion++
    } while (numRepeticion < 10)

    do {
        println("Escribe un número para salir de este bucle")
        val texto = readLine()
        val num = texto?.toIntOrNull()
    } while (num == null)
}