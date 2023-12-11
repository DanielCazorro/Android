// Función que genera una presentación formal con nombre y apellido
fun presentationFormal(name: String, lastName: String): String {
    return "Hello!! I'm $name $lastName"
}

// Función que imprime una presentación rápida con nombre y apellido
fun presentationQuick(name: String, lastName: String) = println("Hello!, I'm $name and my Last Name is $lastName")

// Función que suma dos enteros y devuelve el resultado como un string
fun intSum(firstInt: Int, secondInt: Int) = (firstInt + secondInt).toString()

fun main() {
    // Imprime la presentación formal con nombre y apellido dados
    println(presentationFormal("Daniel", "Cazorro"))

    // Llama a la función presentationQuick para una presentación rápida con nombre y apellido
    presentationQuick("Sandra", "García")

    // Imprime la suma de dos enteros como un string
    println(intSum(5, 12))
}
