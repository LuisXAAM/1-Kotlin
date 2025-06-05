package curso_Udemy.Practice_Time_2_6

import kotlin.math.roundToInt

fun main () {
    println("task 1")

    val fishes: Int = 2.plus(71).plus(233).minus(13)
    val aquariums: Int = fishes.div(30.0).roundToInt()

    println("fishes: $fishes")
    println("aquariums: $aquariums")

    ///////////////////////////////////////////////////////////////////////

    println(" task 2")

    var rainbowColor: String = "blue"
    rainbowColor = "red"

    val blackColor: String = "black"
    /*
    blackColor = "white"


    error en blackColor = "white" ya que es inmutable
     */

    ///////////////////////////////////////////////////////////////

    println("task 3")

    rainbowColor = "Red"

    var greenColor: String? = null
    var blueColor = null

    println("greenColor $greenColor")
    println("blueColor $blueColor")

    ////////////////////////////////////////////////////////////////

    println("task 4")

    val firstVariantNull = listOf(null, null)
    val secondVariantNull = arrayListOf(null, null)

    println("firstVariantNull: $firstVariantNull")
    println("secondVariantNull: $secondVariantNull")

    val firstVariantNullable: List<Any?> = listOf(null, null)
    val secondVariantNullable: List<Any?>? = null

    println("firstVariantNullable: $firstVariantNullable")
    println("secondVariantNullable: $secondVariantNullable")

    /////////////////////////////////////////////////////////

    println("task 5")

    var nullTest: Int? = null

    nullTest = 1

    println("nullTest value: ${nullTest?.inc() ?: 0}")
}