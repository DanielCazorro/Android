import kotlin.random.Random

fun main() {
    // Haciendo una llamada a Internet y recibiendo la respuesta
    val response = callToInternet()

    // Analizando la respuesta usando "when" para las subclases de Response
    when (response) {
        is CharacterPart11 -> println("Success. The character is ${response.name}")
        is Error -> println("Error!! ${response.message}")
    }
}

// Data class para representar un personaje
data class CharacterPart11(val name: String, val surname: String) : Response()

// Data class para representar un mensaje de error
data class Error(val message: String) : Response()

// Sealed class Response que representa la respuesta de la llamada a Internet
sealed class Response

// Función simulada de llamada a Internet que devuelve una instancia de Response (CharacterPart11 o Error)
fun callToInternet(): Response {
    return if (Random.nextBoolean())
        CharacterPart11("Character", "Surname") // Devuelve un personaje
    else
        Error("Wild Error appear") // Devuelve un mensaje de error
}
