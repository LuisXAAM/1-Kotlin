package curso_Udemy.practice_Time_4_8.Books

class eBook(name: String, author: String, val format: String = "text") : Book(name, author) {

    private var wordCount = 0

    override fun readPage() {
        super.readPage()
        wordCount += 250
    }

    val getCurrentWordCount: Int
        get() { return wordCount }

}