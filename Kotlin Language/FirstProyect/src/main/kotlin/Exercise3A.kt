/*
Create a function that determines what price they should pay for the subscription
 */
fun priceToPay(age: Int, zone: String) {
    println("Your age is $age. And your zone is: $zone")
    val price: Float

    when {
        (age >= 0) && (age < 18) -> {
            price = 200.00f
            println("Jóven. Precio a pagar: $price €")
        }

        (age >= 65) -> {
            price = when {
                zone == "E1" || zone == "E2" -> {
                    // Comprobar aquí si podemos hacerlo -
                    0.01f
                }

                else -> {
                    0.00f
                }
            }

            println("Tercera Edad. Precio a pagar: $price €")
        }

        else -> {
            price = when (zone) {
                "A" -> {
                    546.00f
                }
                "B1" -> {
                    637.00f
                }
                "B2" -> {
                    720.00f
                }
                "B3", "C1", "C2" -> {
                    820.00f
                }
                "E1" -> {
                    1106.00f
                }
                "E2" -> {
                    13818.00f
                }
                else -> {
                    // Capturar aquí el error?
                    0.00f
                }
            }
            println("Normal. Precio a pagar: $price €")
        }
    }

}

// Testing
fun main() {
    println("---Should Be: Jóven and 200€")
    priceToPay(1, "a")

    println("---Should Be: Tercera Edad and 0€")
    priceToPay(85, "z")

    println("---Should Be: Normal and 1106€")
    priceToPay(28, "E1")
}