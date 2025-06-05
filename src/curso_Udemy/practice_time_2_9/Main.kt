package curso_Udemy.practice_time_2_9

fun main(){

    println("task 1")

    val trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like to eat $trout and $snapper, but not a big fan of $haddock.")

    //////////////////////////////////////////////////////////////////////////////////

    println("task 2")

    val fishName = "Nemo"

    when(fishName.length){
        0 -> println("Fish name cannot be empty")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }


}