package curso_Udemy.Practice_time_5_3

import curso_Udemy.Practice_time_5_3.book.Book

fun main(){

    val book = Book("100 años de soledad", "Gabriel Garcia Marquez", 1967)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")
    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

}