package curso_Udemy.Practice_Time_2_12

fun main(){
    println("task 1")

    val numbers = Array(5) { 11 + it }
    val mutableStringList = mutableListOf<String>()

    for (number in numbers) {
        mutableStringList.add(number.toString())
    }
    println(mutableStringList.toString())

}

