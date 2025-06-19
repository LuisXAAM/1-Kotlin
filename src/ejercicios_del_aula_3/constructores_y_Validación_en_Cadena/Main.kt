package ejercicios_del_aula_3.constructores_y_Validación_en_Cadena

class Usuario(val username: String, val email: String) {

    init {
        require(username.isNotBlank()) { "El nombre de usuario no puede estar vacío." }
    }

    constructor(username: String) : this(
        username,
        "$username@empresa.com".also {
            require(it.contains("@")) { "Email generado no es válido: $it" }
        }
    )


    fun mostrarInfo() {
        println("Usuario: $username, Email: $email")
    }
}

fun main() {

    val usuario1 = Usuario("LuisXaa,", "luisalfonsovilchez@gmail.com")
    usuario1.mostrarInfo()
    val usuario2 = Usuario("Luisxaam")
    usuario2.mostrarInfo()

}
