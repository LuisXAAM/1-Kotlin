package curso_Udemy.Practice_Time_5_9

import kotlin.math.max


fun Book.weight(): Double {
    return this.pages * 1.5
}

fun Book.tornPages(pagesTorn: Int) {
    pages = max(0, pages - pagesTorn)
}
