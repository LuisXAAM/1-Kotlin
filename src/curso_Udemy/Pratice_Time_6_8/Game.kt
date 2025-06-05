package curso_Udemy.Pratice_Time_6_8

class Game {

    private val location = Location()
    private var path = mutableListOf(Directions.START)

    val north = {
        path.add(Directions.NORTH)
        location.moveTo(0, -1)
    }

    val south = {
        path.add(Directions.SOUTH)
        location.moveTo(0, 1)
    }

    val east = {
        path.add(Directions.EAST)
        location.moveTo(1, 0)
    }

    val west = {
        path.add(Directions.WEST)
        location.moveTo(-1, 0)
    }

    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Unit) {
        where()
        println("Location: ${location.describe()}")
    }

    fun makeMove(input: String?) {
        when (input?.lowercase()) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> {
                end()
                println("Thanks for playing!")
                kotlin.system.exitProcess(0)
            }
        }
    }
}
