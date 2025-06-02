package ejercicios_del_aula_2

/* Exercise 1: Optional User Details 👤
Declare three nullable String variables: userName, userEmail, and userBio.
Assign some values to these variables, ensuring at least one of them is null for testing purposes.
Print the user's details.
If userName is null, print "Name: [Not provided]". Otherwise, print "Name: [actual name]".
If userEmail is null, print "Email: [Not available]". Otherwise, print "Email: [actual email]".
For userBio:
If userBio is null, print "Bio: [User has no bio]".
If userBio is not null but is an empty string, also print "Bio: [User has no bio or it's empty]".
Otherwise, print "Bio: [actual bio]". You must use the safe call operator (?.) and the Elvis operator (?:) for graceful handling of nulls.

 */
fun main() {
    var userName : String? = null
    var userEmail : String? = null
    var userBio : String? = null

    userName= "Luis Vilchez"
    userEmail= "luis.Vilchez@unicda.edu.do"

    println(userName ?: "not provided")
    println(userEmail ?: "not available")
    println(userBio ?: "user has no bio")

    /*
    Exercise 2: Simple To-Do List ✅
Create a mutable list designed to store nullable String values, representing to-do items.
Add a few to-do items (as Strings) to the list. Also, add a null value to the list.
Write code to print each to-do item:
Iterate through the list.
For each item, use the Elvis operator (?:) to print "[No task description]" if the item is null. Otherwise, print the task.
Implement a way to get the first task:
Safely try to get the first element of the list.
If the list is empty, print "No tasks in the list."
If the list is not empty, print "First task: [task]". If that first task itself was null, ensure your code handles this gracefully (e.g., by using the Elvis operator again).


     */

    val toDoList : MutableList<String?> = mutableListOf("Ir al Supermercado", "Pagar el Internet", null , "Hacer la tarea","Arreglar el carro" )

    println("To-Do list")
    for(task in toDoList){
        println(task ?:"[No task description]")
    }
    val firstTask = toDoList.firstOrNull()

    if (firstTask == null) {
        println("First task: [No task description]")
    } else {
        println("First task: ${firstTask ?: "[No task description]"}")
    }
}