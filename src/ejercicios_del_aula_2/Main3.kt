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

    /*

    Exercise 3: Item Prices 💰
Create an array of String to store item names. Initialize it with a few item names.
Create a second array of nullable Doubles (Double?) to store the corresponding prices. This allows for some items to not have a price listed yet. Initialize it with some prices and at least one null, ensuring both arrays have the same number of elements.
Write code to print the details for a specific item by index:
Choose an index programmatically (e.g., assign it to a variable).
Safely access the item name from the first array and its price from the second array using this index.
Print a message like: "Item: [Name], Price: $[Price]"
If the price is null for that item, print "Item: [Name], Price: Not available".
If the chosen index is out of bounds for the arrays, print "Invalid item index."
     */

    var itemName: ArrayList<String> = arrayListOf("Huevos", "Tomates", "ajies", "cebolla", "Pollo", "res")
    var itemPrice: MutableList<Double?> = mutableListOf(230.69,27.45,null,70.25,128.62,169.5)

    var indexSelect =1

    if(indexSelect in itemName.indices){
        var nombre = itemName[indexSelect]
        var price  = itemPrice[indexSelect]
        println("Artículo: $nombre, Precio: ${price?.run { "\$$this" } ?: "No disponible"}")
    } else {
        println("Índice de elemento no válido")
    }

    /*

    Exercise 4: Default Configuration Values ⚙️
Declare two nullable variables: settingColorTheme (String) and settingFontSize (Int).
Simulate loading these settings by assigning them values, or leaving one or both null.
Determine the actual values to use:
For actualColorTheme, use settingColorTheme if it's not null; otherwise, default to "Light".
For actualFontSize, use settingFontSize if it's not null; otherwise, default to 12.
You must use the Elvis operator (?:) for this.
Print the actual settings being applied in the format: "Applying theme: [actualColorTheme], Font size: [actualFontSize]pt."
     */
    var settingColorTheme : String? = null
    var settingFontSize : Int? = null

    var actualColorTheme = settingColorTheme ?: "Light"
    var actualFontSize = settingFontSize ?: 12

    println("Applying theme: $actualColorTheme, Font size: $actualFontSize")
/*

Exercise 5: Summing Nullable Scores 📊
Create a read-only list of nullable Integers (List<Int?>) that contains a mix of integer scores and null values.
Iterate through the list. For each element:
If the element is not null, print "Score recorded: [score]".
If the element is null, print "Attempt missed."
Calculate the sum of all non-null scores in the list.
Initialize a sum variable to 0.
In your loop, only add the score to your sum if it's not null.
Print the total sum: "Total score from recorded attempts: [sum]".
BONUS: Create a new list that contains only the non-null scores from the original list. Print this new list.
 */

    val scores : List<Int?> = listOf(80,null,60,89,null,95,null,100,72,null)
    var sum = 0

    for(score in scores ) if(score != null ){println("Score recorded: $score")
    sum += score} else{println("Attempt missed")}

    println("Total score from recorded attempts: $sum")

    val scorenotnull = scores.filterNotNull()
    println(" valid score: ${scorenotnull}")
}