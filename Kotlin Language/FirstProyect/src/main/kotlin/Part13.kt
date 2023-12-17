fun main() {
    // Puedes crear instancias de Saiyayin2 y utilizar sus métodos
    val saiyan = Saiyayin2("Goku", 100)
    saiyan.sayName()
    saiyan.sayLife()
}

// Interface Character13 con propiedades y métodos comunes para personajes
interface Character13 {
    var name: String
    var life: Int

    fun sayName()
    fun sayLife() {
        println("My life is $life")
    }
}

// Clase Saiyayin2 que implementa la interfaz Character13
data class Saiyayin2(override var name: String, override var life: Int) : Character13 {
    override fun sayName() {
        println("My name is $name")
    }

    override fun sayLife() {
        println("My life is $life")
    }
}
