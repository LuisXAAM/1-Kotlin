package ejercicios_del_aula_3.Figuras_Geometricas


open class FiguraGeometrica(val nombre: String) {
    fun imprimirNombre() {
        println("Soy una figura: $nombre")
    }
}


class Circulo(nombre: String, val radio: Double) : FiguraGeometrica(nombre)


class Cuadrado(nombre: String, val lado: Double) : FiguraGeometrica(nombre)

fun main() {
    val miCirculo = Circulo("Círculo", 5.0)
    val miCuadrado = Cuadrado("Cuadrado", 4.0)

    miCirculo.imprimirNombre()
    miCuadrado.imprimirNombre()
}
