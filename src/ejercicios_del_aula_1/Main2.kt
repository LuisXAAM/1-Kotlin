package ejercicios_del_aula_1
/*
Exercise 1: Simple Age Checker 👶👴
Declare a mutable variable to store a person's age.
Assign an initial age to the variable.
Write an if-else statement that prints:
"Minor" if the age is less than 18.
"Adult" if the age is 18 or greater.
Reassign a different age to your variable and observe the output.
*/
fun main() {
    var luis = 22
    var sara = 15

    if (luis < 18) {
        println("luis es menor")
    } else {
        println("luis es mayor")
    }
    if (sara < 18) {
        println("sara es menor")
    } else {
        println("sara es mayor")
    }

    /*Exercise 2: Grade Evaluator 🎓
Declare an immutable variable to store a student's numerical grade (e.g., out of 100).
Write a series of if-else if-else statements to print the letter grade based on the following scale:
90-100: "A"
80-89: "B"
70-79: "C"
60-69: "D"
Below 60: "F"

 */
    val luisGrade = 95
    if (luisGrade in 90..100) {
        println("A")
    } else if (luisGrade in 80..89) {
        println("B")
    } else if (luisGrade in 70..79) {
        println("C")
    } else if (luisGrade in 60..69) {
        println("D")
    } else {
        println("F")
    }
    /*
    Declare a mutable variable to store the current color of a traffic light (as a String, e.g., "Red", "Yellow", "Green").
    Write a when statement (Kotlin's version of a switch statement) that prints the action a driver should take based on the light's color:
    "Red": "Stop"
    "Yellow": "Caution"
    "Green": "Go"
    Any other color: "Invalid light color"
    Change the light color and see the different actions.
*/
    var trafficLight = "Green"

    when (trafficLight)
    {
        "Green" -> println("Go")
        "Red" -> println("Stop")
        "Yellow" -> println("Caution")
    }

    /* Exercise 4: Even or Odd? 🤔
Declare an immutable variable and initialize it with an integer.
Write an if-else statement to determine if the number is even or odd.
Print whether the number is "Even" or "Odd".
Hint: You might need the modulo operator (%).

     */

    val x = 9

    if (x % 2 == 0) {println("x es par" )}else {println("x es impar")}

    /* Exercise 5: Login Attempt 🔑
Declare two immutable String variables: savedUsername and savedPassword. Initialize them with some values.
Declare two mutable String variables: enteredUsername and enteredPassword.
Simulate a user entering a username and password by assigning values to enteredUsername and enteredPassword.
Write an if statement with nested if statements (or use logical operators &&) to check:
If enteredUsername matches savedUsername.
If they match, then check if enteredPassword matches savedPassword.
Print:
"Login Successful" if both match.
"Incorrect Password" if the username matches but the password doesn't.
"Incorrect Username" if the username doesn't match.

     */

    val savedUsername = "LuisXaam"
    val savedPassword = 12345689

    var enteredUsername = "LuisXaam"
    var enteredPassword = 23456789

    if (savedUsername == enteredUsername && savedPassword == enteredPassword) {println("Login Successful")}
    else if (savedUsername == enteredUsername && savedPassword !== enteredPassword) {println("Incorrect Password")}
    else{println("Incorrect Username")}

    /*
    Exercise 6: Temperature Guide 🌡️
Declare an immutable variable to store the current temperature in Celsius (as a Double or Int).
Write a when statement that provides advice based on the temperature range:
Less than 0: "Freezing! Wear very warm clothes."
0 to 10: "Cold. Wear a warm jacket."
11 to 20: "Cool. A light jacket should be fine."
21 to 30: "Warm. Enjoy the weather!"
Above 30: "Hot! Stay hydrated."
Use an else branch in the when for any temperatures outside these specific descriptions, perhaps printing "Temperature out of typical range."
     */

    val temperature = 25

    val advice = when {
        temperature < 0 -> "Freezing! Wear very warm clothes."
        temperature in 0..10 -> "Cold. Wear a warm jacket."
        temperature in 11..20 -> "Cool. A light jacket should be fine."
        temperature in 21..30 -> "Warm. Enjoy the weather!"
        temperature > 30 -> "Hot! Stay hydrated."
        else -> "Temperature out of typical range."
    }

    println(advice)
}