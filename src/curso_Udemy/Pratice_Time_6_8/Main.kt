package curso_Udemy.Pratice_Time_6_8

fun main() {
    val game = Game()

    while (true) {
        print("Enter a direction (n/s/e/w) or anything else to quit: ")
        val input = readLine()
        game.makeMove(input)
    }
}
