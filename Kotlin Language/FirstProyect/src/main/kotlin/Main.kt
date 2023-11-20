fun main() {

    // MARK: Booleans
    println("----------Booleans----------")
    var booleanTrue = true
    val booleanFalse = false

    // Si yo cambio el valor de booleanTrue, va a funcionar
    booleanTrue = false
    println(booleanTrue)

    // Si yo cambio el valor de booleanFalse, no va a funcionar
    // booleanFalse = true
    println(booleanFalse)

    // Con esto forzamos el tipo. Ahora mismo no sería necesario
    var anotherBoolean: Boolean = true
    println(anotherBoolean)

    // MARK: Ints
    println("----------Ints----------")
    var integer1 = 1
    println(integer1)

    var decimal = 1.0
}