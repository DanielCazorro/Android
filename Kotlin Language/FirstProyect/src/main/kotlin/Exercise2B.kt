fun presentationFormal(name: String, lastName: String): String {
    return "Hello!! I'm $name $lastName"
}

fun presentationQuick(name: String, lastName: String) = println("Hello!, I'm $name and my Last Name is $lastName")

fun intSum(firstInt: Int, secondInt: Int) = (firstInt + secondInt).toString()

fun main() {
    println(presentationFormal("Daniel", "Cazorro"))
    presentationQuick("Sandra", "García")

    println(intSum(5, 12))
}