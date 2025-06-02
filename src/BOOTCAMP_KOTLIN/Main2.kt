package BOOTCAMP_KOTLIN

/* 3. Compare conditions and booleans

aqui se usan los mismos operadores de comparacion ( <, ==, >, !=, <=, >=).
y agregamos condiciones con el if y el else

 */



fun main (){
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    // tambien en kotlin tenemos los rangos aplicando dos puntos en el medio ejemplo 1..10 este rango abarca desde  el 1 hasta el 10
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }

    // tambien tenemos lo que es When que es similar al switch en otro lenguajes

    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
// aqui no se permiten valores nulos por default tienes que especificarlo en el tipo de datos con un signo de pregunta

    var marbles: Int? = null

    // con el operador "?" podemos verificar cuando es nulo asi ahorrando escribir tantos if/else
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    fishFoodTreats = fishFoodTreats?.dec() ?: 0


}