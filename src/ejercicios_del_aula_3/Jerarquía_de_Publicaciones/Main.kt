package ejercicios_del_aula_3.Jerarquía_de_Publicaciones

open class Publicacion (val titulo:String, val autor : String){
    fun publicar() {
        println("$titulo Publicado por $autor")
    }
}
class Libro(titulo: String, autor: String, val numeroPaginas : Int) : Publicacion(titulo, autor)
class ArticuloDeRevista(titulo: String, autor: String, val nombreRevista: String) : Publicacion(titulo, autor)


fun main() {

    val libro = Libro("Kotlin para principiantes", "Luis Vilchez", 250)


    val articulo = ArticuloDeRevista("Inteligencia Artificial en 2025", "Ana Gomez", "TechWorld")


    println("Libro")
    println("Título: ${libro.titulo}")
    println("Autor: ${libro.autor}")
    println("Número de páginas: ${libro.numeroPaginas}\n")

    println("Artículo de Revista:")
    println("Título: ${articulo.titulo}")
    println("Autor: ${articulo.autor}")
    println("Revista: ${articulo.nombreRevista}")
}