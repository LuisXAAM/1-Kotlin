package ejercicios_del_aula_3.constructores_Secundarios

class Producto (val codigo : String , var precio : Double){
    init {
        if (precio < 0) {
            throw IllegalArgumentException("El precio no puede ser negativo. Valor recibido: $precio")
        }
    }
    constructor(codigo: String) : this(codigo, 9.99)

    constructor() : this("A-1", 0.99)

    fun mostrarDetalles() {
        println("Producto: Código = $codigo, Precio = $precio")
    }
}
fun main() {

    val producto1 = Producto("A-12", 15.50)


    val producto2 = Producto("D-7")


    val producto3 = Producto()


    producto1.mostrarDetalles()
    producto2.mostrarDetalles()
    producto3.mostrarDetalles()

}