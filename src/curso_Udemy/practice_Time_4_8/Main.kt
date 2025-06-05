package curso_Udemy.practice_Time_4_8

import curso_Udemy.practice_Time_4_8.Books.Book
import curso_Udemy.practice_Time_4_8.Books.eBook

fun main() {
    val libraryBook = Book("100 años de soledad", " Gabriel García Márquez")
    libraryBook.readPage()
    libraryBook.readPage()
    libraryBook.readPage()

    val digitalBook = eBook("BORUTO: TWO BLUE VORTEX Nº 03", "masashi kishimoto")
    digitalBook.readPage()
    digitalBook.readPage()
    digitalBook.readPage()

    println("Progress of each book:")
    println("${libraryBook.name}: ${libraryBook.getCurrentPage} pages")
    println("${digitalBook.name}: ${digitalBook.getCurrentPage} pages and ${digitalBook.getCurrentWordCount} words")
}