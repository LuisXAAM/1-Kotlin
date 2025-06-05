package curso_Udemy.Pratice_Time_6_8
class Location(private val width: Int = 4, private val height: Int = 4) {
    private val map = Array(width) { Array(height) { "A quiet field..." } }
    var x = 0
    var y = 0

    init {
        map[0][0] = "Start at the village"
        map[1][0] = "You see a forest"
        map[2][0] = "A small river flows here"
        map[3][0] = "End of the path"
        map[1][1] = "You find a mysterious cave"
        map[2][2] = "There’s an ancient ruin here"
        map[3][3] = "You discovered treasure!"
    }

    fun describe(): String = map.getOrNull(x)?.getOrNull(y) ?: "You see nothing."

    fun moveTo(dx: Int, dy: Int) {
        val newX = (x + dx).coerceIn(0, width - 1)
        val newY = (y + dy).coerceIn(0, height - 1)
        x = newX
        y = newY
    }
}
