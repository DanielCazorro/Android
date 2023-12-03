/*
Create a list of several elements using only what we have seen so far and this code:
-val list = listOf("H",1,2,"o",0.2,"l",1.0,"a",0.2,"!")
We carry out a program that:
-Add all the numbers in the list into the same variable (Integers and Doubles) and print it
-Concatenate all Strings into a single String and print it
 */

fun main() {
    val list = listOf("H",1,2,"o",0.2,"l",1.0,"a",0.2,"!")

    var totalNumbers = 0.0
    var totalStrings = ""

    list.forEach {
        when (it) {
            is Int -> totalNumbers += it
            is Double -> totalNumbers += it
            is String -> totalStrings += it
        }
    }
    println(totalNumbers)
    println(totalStrings)

}