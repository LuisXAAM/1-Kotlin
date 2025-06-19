package ejercicios_del_aula_3


fun main() {
    buildAquarium()
    println("ejercicio2 ")
    buildAquarium2()
}



class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}







fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

//////////////////////////////////////

//ejercicio 2

class Aquarium2(length: Int = 100, width: Int = 20, height: Int = 40) {
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height

    init {
        println("aquarium initializing")
    }


    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 liter
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume liters")
    }

}



fun buildAquarium2() {
    val aquarium1 = Aquarium2()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium2(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium2(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium2(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium6 = Aquarium2(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()

}
