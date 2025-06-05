package curso_Udemy.Practice_Time_6_5

fun List<Int>.filterWithCondition(condition: (Int) -> Int): List<Int> {
    return this.filter { condition(it) == 0 }
}
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val divisibleBy3 = numbers.filterWithCondition { it % 3 }

    println(divisibleBy3)
}
