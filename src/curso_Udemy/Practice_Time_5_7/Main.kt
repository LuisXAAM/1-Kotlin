package curso_Udemy.Practice_Time_5_7

import curso_Udemy.Practice_Time_5_7.book.Book


fun main() {
    val book = Book("planet of the apes", "Pierre Boulle", 1963)

    println("Can borrow more books? ${book.canBorrow(5)}")
    book.printUrl()
}






