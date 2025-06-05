package curso_Udemy.Practice_Time_3_13

fun main () {
    print(whatShouldIDoToday("happy"))
    print(whatShouldIDoToday("sad", "rainy"))
    print(whatShouldIDoToday("excited", "cloudy", 18))
    print(whatShouldIDoToday("bored", "sunny", 30))
    print(whatShouldIDoToday("tired", "rainy", 12))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    val params = "mood: $mood; weather: $weather; temperature: $temperature"

    val toDo = when {
        (mood == "happy" && weather == "sunny" && temperature > 22) -> "Go for a picnic!"
        (mood == "sad" && weather == "rainy") -> "Stay in and watch a movie."
        (mood == "excited" && temperature in 15..25) -> "Go to play basketball!"
        (mood == "bored" && weather == "sunny" && temperature > 25) -> "Go to the beach!"
        (mood == "tired" && weather == "rainy" && temperature < 15) -> "Take a nap with a warm drink."
        else -> "Just relax and do whatever makes you feel good."
    }

    return "$params\n$toDo\n\n"
}