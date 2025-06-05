package curso_Udemy.Practice_Time_6_3

class Game {

    var path = mutableListOf(Directions.START)

    val north = {
        path.add(Directions.NORTH)
    }

    val south = {
        path.add(Directions.SOUTH)
    }

    val east = {
        path.add(Directions.EAST)
    }

    val west = {
        path.add(Directions.WEST)
    }

    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}

