package curso_Udemy.Practice_Time_5_7.book


import curso_Udemy.Practice_Time_5_7.book.MAX_NUMBER_BOOKS

class Book(val title: String, val author: String, val year: Int) {

    fun canBorrow(hasBooks: Int): Boolean {
        return hasBooks < MAX_NUMBER_BOOKS
    }

    fun printUrl() {
        println(BASE_URL + title.replace(" ", "_") + ".html")
    }

    companion object {
        private const val BASE_URL = "http://www.turtlecare.net/"
    }
}
