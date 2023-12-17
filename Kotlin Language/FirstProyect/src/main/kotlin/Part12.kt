fun main() {
    // Lista de personajes de distintas razas
    val list = listOf(
        Saiyan("Goku", 100, false, true),
        Saiyan("Vegeta", 100, true, true),
        Namekian("Piccolo", 100, true, false),
        Human("Krilin", 100).apply {
            timesDied = Int.MAX_VALUE
            timesResurrected = Int.MAX_VALUE
        }
    )

    // Contadores para cada raza
    var saiyans = 0
    var namekians = 0
    var humans = 0

    // Recorre la lista de personajes
    list.forEach {
        when (it) {
            is Saiyan -> {
                it.showName()
                saiyans++
            }
            is Namekian -> {
                it.showName()
                namekians++
            }
            is Human -> {
                it.showName()
                humans++
            }
        }
    }

    // Ordena la lista por nombre y la imprime
    println(list.sortedBy { it.name })
}

// Clase base Character con propiedades compartidas por todas las razas
open class Character12(val name: String, var life: Int) {
    fun showName() = println("My name is $name")
    fun showLife() = println("My life is $life")

    override fun toString(): String = "My name is $name"
}

// Clase Saiyan que hereda de Character
class Saiyan(name: String, life: Int, val hasTail: Boolean, val hasTransformation: Boolean) :
    Character12(name, life)

// Clase Namekian que hereda de Character
class Namekian(name: String, life: Int, val hasAntennas: Boolean, val makesEggs: Boolean) :
    Character12(name, life)

// Clase Human que hereda de Character
class Human(name: String, life: Int) : Character12(name, life) {
    var timesDied = 0
    var timesResurrected = 0

    fun showDeads() = println("I've died $timesDied times")
    fun showResurrections() = println("I've been resurrected $timesResurrected times")
}
