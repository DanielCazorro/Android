fun main() {
    // Creación de una instancia de Character sin uso explícito
    var character1 = Character()
    character1.age

    println(character1) // Imprime: "Mi nombre es Daniel y tengo 31 años"

    // Creación de una instancia de CharacterWithConstructor con parámetros definidos
    var character2 = CharacterWithConstructor("Pedro", 50)
    character2.age = 36 // Modificación del valor de age en character2

    println(character2) // Imprime: "Mi nombre es Pedro y tengo 36 años"
}

// Clase Character con nombre por defecto "Daniel" y edad por defecto 31
class Character() {
    private var nombre = "Daniel"
    var age = 31

    // Método para establecer un nombre
    fun getName(name: String) {
        nombre = name
    }

    // Sobrescritura del método toString para mostrar información del personaje
    override fun toString(): String {
        return "Mi nombre es $nombre y tengo $age años"
    }
}

// Clase CharacterWithConstructor con nombre y edad definidos en el constructor
class CharacterWithConstructor(private var name: String, var age: Int) {
    val hairColour = "Blue" // Valor de color de pelo predeterminado

    // Sobrescritura del método toString para mostrar información del personaje
    override fun toString(): String {
        return "Mi nombre es $name y tengo $age años"
    }
}
