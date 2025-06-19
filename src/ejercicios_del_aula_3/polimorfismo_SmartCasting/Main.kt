package ejercicios_del_aula_3.polimorfismo_SmartCasting



abstract class Animal(val nombre: String) {
    abstract fun hacerSonido()
    abstract fun moverse()

}

class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre dice: ¡Guau guau!")
    }

    override fun moverse() {
        println("$nombre corre en el parque.")
    }
}

class Gato(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre dice: ¡miau miau!")
    }

    override fun moverse() {
        println("$nombre se come un raton.")
    }
}

class Pajaro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre dice: ¡Pío pío!")
    }

    override fun moverse() {
        println("$nombre vuela por el cielo.")
    }
}

fun describirComportamiento(animal: Animal) {
    when (animal ){
        is Perro -> println("Este animal es el mejor amigo del hombre.")
        is Pajaro -> println("Este animal vuela alto.")
        else -> println("Este animal tiene un comportamiento interesante.")
    }
}

fun main (){
    val perro = Perro("Perro")
    val gato = Gato("Gato")
    val pajaro = Pajaro("Pajaro")

    val animales : List<Animal> = listOf(perro, gato, pajaro)

    for (animal in animales) {
        animal.hacerSonido()
        animal.moverse()
        describirComportamiento(animal)
        println()
    }
}
