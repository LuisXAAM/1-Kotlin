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
    println(java.util.Arrays.toString(schools))      // nota Un array declarado con arrayOf no tiene un tipo asociado a los elementos
// , por lo que puedes mezclar tipos,
// lo cual es útil.
// Declara un array con diferentes tipos.
    val mix = arrayOf("fish", 2)

    // podemos combinar dos arrays usando +

    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    // bucles o loops
    // utilizamos el famoso bucle for para recorrer los elementos de un arreglo

    for (element in schools) {
        print(element + " ")
    }

    //tambien podemos utilizar bucles para los elementos y su indice al mismo tiempo

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    //otros ejemplos de bucles

    for (i in 1..5) print(i)  // elementos entre los rangos del 1 al 5 
  

    for (i in 5 downTo 1) print(i)  // cuenta regresiva desde el 5 al 1 
  

    for (i in 3..6 step 2) print(i) // saltando dos desde el 3 al 6

    for (i in 'd'..'g') print (i)  //elementos entre los rangos d y g


    //BUCLE WHILE    Y DO WHILE

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
   



    

}



