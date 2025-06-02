package BOOTCAMP_KOTLIN
import java.util.Arrays.toString

// Arreglos , listas y bucles
// cuando declaramos una lista esta no puede ser modificada para declararla utilizamos "listOf"

fun main (){
    val school = listOf("mackerel", "trout", "halibut")
    println(school)
    // si queremos declarar una lista que pueda ser modificada usamos "mutableListOf"
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)

    //Declaramos un array de string utilizando "arrayOf"

    val schools = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(schools))


}



