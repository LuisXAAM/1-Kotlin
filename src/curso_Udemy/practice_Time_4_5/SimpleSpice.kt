package curso_Udemy.practice_Time_4_5

import kotlin.random.Random

class Spice (val name: String, val spiciness: String = "mild") {

    init {
        println(toString())
    }

    val heat: Int
        get() { return calculateSpicinessHeat(spiciness) }

    private fun calculateSpicinessHeat (spiciness: String): Int {
        return when (spiciness.lowercase()) {
            "mild" -> Random.nextInt(1000 + 1)
            "medium" -> Random.nextInt(2500, 30001)
            "hot" -> Random.nextInt(30001, 100001)
            "extrahot" -> Random.nextInt(100001, 300001)
            "extremely" -> Random.nextInt(300001, 10000000)
            else -> 0
        }
    }

    override fun toString(): String {
        return "[$name]-[$spiciness]: $heat"
    }

}