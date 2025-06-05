package curso_Udemy.Greetings_Kotlin

fun main(){
    var time : Int = 11

    when (time.toInt()) {

       in 0..12 -> println("Good morning Kotlin")
        in 13..18  ->  println("Good afternoon Kotlin")
        in 19..23 -> println("Good Night Kotlin")
        else -> println("time out of range")

    }

}