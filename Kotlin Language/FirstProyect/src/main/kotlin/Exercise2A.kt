/*
Create a function that determines what price they should pay for the subscription
 */
fun priceToPay(age: Int, zone: String) {
    println("Your age is $age. And your zone is: $zone")
    var price: Float = 0.00f // Inicializamos el precio con un valor por defecto

    when {
        (age >= 0) && (age < 18) -> {
            price = 200.00f
            println("Young. Price to pay: $price €")
        }

        (age >= 65) -> {
            price = when {
                zone == "E1" || zone == "E2" -> {
                    0.01f // Precio especial para ciertas zonas y edades
                }
                else -> {
                    0.00f // Precio cero para otras zonas
                }
            }
            println("Senior Citizen. Price to pay: $price €")
        }

        else -> {
            price = when (zone) {
                "A" -> 546.00f
                "B1" -> 637.00f
                "B2" -> 720.00f
                "B3", "C1", "C2" -> 820.00f
                "E1" -> 1106.00f
                "E2" -> 13818.00f
                else -> {
                    // En caso de zona desconocida, el precio es cero
                    println("Unknown Zone. Price to pay: $price €")
                    0.00f
                }
            }
            println("Normal. Price to pay: $price €")
        }
    }
}

// Testing
fun main() {
    println("---Should Be: Young and 200€")
    priceToPay(1, "A")

    println("---Should Be: Senior Citizen and 0€")
    priceToPay(85, "Z")

    println("---Should Be: Normal and 1106€")
    priceToPay(28, "E1")
}
