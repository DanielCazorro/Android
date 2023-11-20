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
    integer1 = 2
    integer1 = integer1 + 3
    integer1 = integer1 - 3
    integer1 = integer1 * 3

    integer1 = 6
    integer1 = integer1 / 3
    println("Value of integer1 = $integer1  (Should be 2)")

    // Dividir 7/2 y asignándoselo a un entero, es 3
    integer1 = 7
    integer1 = integer1 / 3
    println("Value of integer1 = $integer1  (Should be ?)")

    integer1 = 7
    val division = integer1.toDouble()/3
    println("Value of division = $division  (Should be 2.333333)")

    integer1 = 7
    val module = integer1.rem(3)
    println("Value of module = $module (Should be 1)")

    var double = 1.0
    println(double)

    var float = 1.0f
    println(float)

    // MARK: Letters
    println("----------Letters----------")
    var letter = 'a'
    println(letter)

    var text = "Hello world!"
    println("${text[0]} ${text[1]}")

    val text2: String
    text2 = "How are you?"
    println(text2)

    var isFloat: Boolean = float is Float
    println("The float is Float? = $isFloat")

    
}