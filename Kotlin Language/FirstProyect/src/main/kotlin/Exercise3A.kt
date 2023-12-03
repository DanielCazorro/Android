/*
Create a function that determines what price they should pay for the subscription
 */
fun priceToPay(age: Int, zone: String) {
    println("Your age is $age. And your zone is: $zone")

    when {
        (age >= 0) && (age < 18) -> {
            println("0-18")
        }

        (age >= 65) -> {
            println("65----")
        }
        else -> {
            println("Normal")
        }
    }

}

// Testing
fun main() {
    priceToPay(1, "a")
}