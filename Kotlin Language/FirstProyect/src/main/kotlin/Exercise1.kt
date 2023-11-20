fun getAge (birthdayYear:Int):Int{
    return  2023 - birthdayYear
}

fun getName (name: String):String {
    return "Hello! I'm $name"
}

fun presentation(name: String, birthdayYear: Int): String {
    return "${getName(name)} and I'm ${getAge(birthdayYear)} years old"
}

fun main() {
    println(presentation(birthdayYear = 1992, name = "Daniel"))
}
