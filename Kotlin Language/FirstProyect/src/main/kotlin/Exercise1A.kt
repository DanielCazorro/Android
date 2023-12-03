fun sumaStrings(firstString: String, secondString: String) {
    val firstInteger = firstString.toInt()
    val secondInteger = secondString.toInt()

    val sum = firstInteger + secondInteger
    val doubleSum = sum.toDouble()

    return println(doubleSum)
}

fun sumaStringsQuick(firstString: String, secondString: String) : Double {
    return (firstString.toInt() + secondString.toInt()).toDouble()
}

fun sumaStringsEasy(firstString: String, secondString: String) = ((firstString.toInt() + secondString.toInt())).toDouble()

fun main() {
    sumaStrings("1", "2")
    println(sumaStringsQuick("1", "8"))
    println(sumaStringsEasy("2", "8"))
}