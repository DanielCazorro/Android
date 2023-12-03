fun main() {

    // MARK: Booleans
    println("----------Booleans----------")
    var booleanTrue = true
    val booleanFalse = false

    // Si cambio el valor de booleanTrue, debería funcionar
    booleanTrue = false
    println("Result should be false. Result = $booleanTrue")

    // Si intento cambiar el valor de booleanFalse, no funcionará
    // booleanFalse = true // Esto dará un error, ya que es una variable 'val' (inmutable)
    println("Result should be false. Result = $booleanFalse")

    // Esto fuerza el tipo, aunque en este momento no sería necesario
    var anotherBoolean: Boolean = true
    println("Result should be true. Result = $anotherBoolean")

    // MARK: Ints
    println("----------Numbers----------")
    var integer1 = 1
    integer1 = 2
    integer1 += 3 // Equivalente a: integer1 = integer1 + 3
    integer1 -= 3 // Equivalente a: integer1 = integer1 - 3
    integer1 *= 3 // Equivalente a: integer1 = integer1 * 3

    integer1 = 6
    integer1 /= 3 // Equivalente a: integer1 = integer1 / 3
    println("Value of integer1 = $integer1  (Should be 2)")

    // Dividir 7 entre 3 y asignarlo a un entero debería dar 2
    integer1 = 7
    integer1 /= 3
    println("Value of integer1 = $integer1  (Should be 2)")

    integer1 = 7
    val division = integer1.toDouble() / 3
    println("Value of division = $division  (Should be 2.333333)")

    integer1 = 7
    val module = integer1.rem(3)
    println("Value of module = $module (Should be 1)")

    var double = 1.0
    println("Should be double: $double")

    var float = 1.0f
    println("Should be float: $float")

    // MARK: Letters
    println("----------Letters----------")
    var letter = 'a'
    println("Should be a: $letter")

    var text = "Hello world!"
    println("Should be H e: ${text[0]} ${text[1]}")

    val text2: String
    text2 = "How are you?"
    println("Should be How are you?: $text2")

    var isFloat: Boolean = float is Float
    println("The float is Float? = $isFloat")

    var integer2: Int? = null
    // integer2 = null

    var text3: String? = null
    // text3[0]   (Esto generará un error si descomentas; intentas acceder a un índice en una cadena nula)

    println("Should be are you?: ${text2.substring(4)}")
    println(text3?.substring(4) ?: "Ups, it was null")

    val text4 = "12"
    val text5 = "34"
    val text6 = text4 + text5
    println("Should be: $text6")
}
