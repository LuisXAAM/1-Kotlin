package curso_Udemy.Practice_time_3_19

import kotlin.random.Random

fun main () {
    println("Task 1")

    val rollDice = { sides: Int -> if (sides < 0) 0 else Random.nextInt(sides + 1) }
    val rollDice2: (Int) -> Int = { sides -> if (sides < 0) 0 else Random.nextInt(sides + 1) }

    println("First roll: ${rollDice(8)}")
    println("Second roll: ${rollDice2(8)}")

    //////////////////////////////////////////////////////////////////////

    println("Task 2")

    fun gamePlay(rollDice: (Int) -> Int) {
        val result = rollDice(10)
        println("Roll result: ${result}")
    }

    gamePlay(rollDice2)
}