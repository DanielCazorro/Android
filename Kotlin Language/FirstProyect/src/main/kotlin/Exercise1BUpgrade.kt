// Bloque (boilerplate)
fun calculaEdad (añoNacimiento:Int): Int {
    return 2023 - añoNacimiento
}
/*
fun calculaEdad (añoNacimiento:Int) = 2023 - añoNacimiento
*/

// Expression body e inferencia
fun presentaNombre(nombre:String) = "Hola! mi nombre es " + nombre

/*
fun presentaNombre(nombre:String): String {
	return "Hola! mi nombre es " + nombre
    }
*/

// Default argument
fun presentacion(nombre:String = "Yago", añoNacimiento:Int) =
    presentaNombre(nombre) + " y tengo " + calculaEdad(añoNacimiento) + " años."

/*
fun presentacion(nombre:String = "Yago", añoNacimiento:Int): String {
    return presentaNombre(nombre) + " y tengo " + calculaEdad(añoNacimiento) + " años."
}
    */

fun main() {
    // named argument
    println(presentacion(añoNacimiento = 1992))
}