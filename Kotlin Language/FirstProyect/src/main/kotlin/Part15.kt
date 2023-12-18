import com.google.gson.Gson

fun main() {
    // Convertir objeto a JSON
    fromObjectToJson()

    // Convertir JSON a objeto
    fromJsonToObject()
}

data class Character15(var name: String, var age: Int)

fun fromObjectToJson() {
    // Crear un objeto Character15
    val character1 = Character15("Goku", 30)

    // Inicializar Gson
    val gson = Gson()

    // Convertir objeto a JSON
    val jsonInString = gson.toJson(character1)
    println(jsonInString)
}

fun fromJsonToObject() {
    // JSON en formato String
    val jsonInString2 = "{\"name\":\"Vegeta\",\"age\":35}"

    // Inicializar Gson
    val gson = Gson()

    // Convertir JSON a objeto Character15
    val character = gson.fromJson(jsonInString2, Character15::class.java)
    println(character)
}
