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
    println("----------Numbers----------")
    var integer1 = 1
    println(integer1)

    var double = 1.0
    println(double)

    var float = 1.0f
    println(float)

    // MARK: Letters
    println("----------Letters----------")
    var letter = 'a'
    println(letter)

    var text = "Hello world!"
    println(text)
}