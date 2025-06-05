package curso_Udemy.Practice_Time_5_9

import kotlin.random.Random

class Puppy {
    fun playWithBook(book: Book) {
        val pagesToTear = Random.nextInt(1, 20) // rompe entre 1 y 19 páginas
        println("🐶 Puppy is tearing $pagesToTear pages!")
        book.tornPages(pagesToTear)
    }
}
