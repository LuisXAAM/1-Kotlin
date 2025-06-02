import kotlin.time.Duration.Companion.minutes

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun printHello() {
        println ("Hello World")
    }

    printHello()

    // operadores kotlin

    //suma
    println(1+1)
    //resta
    println(2-1)
    //multiplicacion
    println(2*5)
    // division
    println(20/10)
    println(1/2)
    println(1.3/2.0)


    val fish: Int = 2
    fish.times(6   )
    fish.div(3)
    fish.plus(5)
    fish.minus(5)

    //types
    println("TYPES")


    val i: Int = 6
    val b1 = i.toByte()
    println("bi is $b1" )

    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)


    val i1: Int = b2.toInt()
    println(i1)


    val i2: String = b2.toString()
    println(i2)

    val i3: Double = b2.toDouble()
    println(i3)

    //tips para hacer los datos mas leibles usando guion abajo

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

}

