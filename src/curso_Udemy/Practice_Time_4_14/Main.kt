package curso_Udemy.Practice_Time_4_14

import curso_Udemy.Practice_Time_4_14.Spice.BrownSpiceColor
import curso_Udemy.Practice_Time_4_14.Spice.Curry
import kotlin.random.Random
import curso_Udemy.Practice_Time_4_14.Spice.Spice

fun main () {
    println("Portion of salt: ${getGramOfSalt()}gm")

    val spiceContainers = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Brown Curry", "hot", BrownSpiceColor))
    )

    println("-- Spice Containers --")

    for (spiceContainer in spiceContainers) {
        println("Label: ${spiceContainer.label} / Spice Color: ${spiceContainer.spice.color}")
    }
}

fun getGramOfSalt () = Random.nextInt(1, 2000)

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}