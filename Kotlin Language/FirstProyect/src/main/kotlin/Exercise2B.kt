/*
Create a function that receives an Integer and a String, the Integer being the life of a character and the String its name. Call it "startCharacter". The function must return a String containing:
-If life is less than 20 points, then it should return: "Caution {Name}, you are under life"
-If the person is between 21 and 80, then they should return: "{Name}, you are a little hurt"
-If the person is over 81, then they should return: "{Name}, you are in perfect condition!
 */

fun  startCharacter(life: Int, name: String): String {

    return when {
        life <= 20 -> {
            "Caution $name, you are under life"
        }

        (life > 21) && (life < 80) -> {
            "$name, you are a little hurt"
        }

        else -> {
            "$name, you are in perfect condition!"
        }
    }
}

fun main() {
    println(startCharacter(90, "Daniel"))
    println(startCharacter(20, "Pedro"))
    println(startCharacter(4, "Juan"))

}