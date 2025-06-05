package curso_Udemy.Practice_Time_5_9

fun main() {
    val book = Book("Itachi Shinden", "Takashi Yano.", 2015, 260)
    val puppy = Puppy()

    println("📚 Book starts with ${book.pages} pages. Weight: ${book.weight()} grams.")

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("📖 Book now has ${book.pages} pages. Weight: ${book.weight()} grams.\n")
    }

    println("The book has been completely destroyed.")
}
