import kotlin.random.Random

/*
Create a Character class that receives the name and current life of the character:

-Be able to cast "receiveHit()", taking away a random number of life (between 10 and 60 points). Life cannot fall below 0.
-Be able to cast "receiveHealing()", adding 20 life points. Life cannot exceed 100 points.
-Stores all hits and healing in a list (positive healing and negative hits).
 */

class CharacterFight(private val name: String, life: Int) {
    private var actualLife : Int = life
    private var listOfPoints: MutableList <Int> = mutableListOf(0)
    fun receiveHit() {
        val lifeToRest = Random.nextInt(10, 61)
        actualLife -= lifeToRest
        listOfPoints.add(lifeToRest * -1)

        if (actualLife < 0) { // Modificamos la condición para asegurarnos de que no haya vida negativa
            actualLife = 0
        }
    }

    fun receiveHealing() {
        actualLife += 20
        if (actualLife > 100) { // Verificamos que la vida no exceda los 100 puntos
            actualLife = 100
        }
        listOfPoints.add(20)
    }

    // Método para mostrar el estado actual del personaje
    fun showStatus() {
        println("Name: $name")
        println("Current life: $actualLife")
        println("List of hits and healing: $listOfPoints")
    }
}

fun main() {
    val character = CharacterFight("John", 100)

    character.receiveHit()
    character.receiveHit()
    character.receiveHealing()

    character.showStatus()
}