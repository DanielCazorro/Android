// Función que calcula la edad basada en el año de nacimiento
fun getAge(birthdayYear: Int): Int {
    val currentYear = 2023
    return currentYear - birthdayYear
}

// Función que genera un saludo con el nombre dado
fun getName(name: String): String {
    return "Hello! I'm $name"
}

// Función que crea una presentación con el nombre y la edad
fun presentation(name: String, birthdayYear: Int): String {
    val greeting = getName(name) // Obtiene el saludo usando la función getName
    val age = getAge(birthdayYear) // Obtiene la edad usando la función getAge
    return "$greeting and I'm $age years old" // Retorna la presentación completa
}

fun main() {
    // Imprime la presentación con el nombre y el año de nacimiento dados
    println(presentation(name = "Daniel", birthdayYear = 1992))
}
