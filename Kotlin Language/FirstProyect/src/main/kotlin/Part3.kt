fun main() {
    println("-----ifClassic()-----")
    println("Should be: are not the same")
    ifClassic(1, 2)
    println("Should be: are the same")
    ifClassic(1,1)
    println("-----ifClassicEasy-----")
    println("Should be: are not the same")
    ifClassicEasy(1,2)
    println("Should be: are the same")
    ifClassicEasy(1,1)
}

fun ifClassic(number1: Int, number2: Int) {
    if (number1 == number2)
        println("Are the same")
    else
        println("Are not the same")
}

fun ifClassicEasy(number1: Int, number2: Int) =
    if (number1 == number2)
        println("Are the same")
    else
        println("Are not the same")