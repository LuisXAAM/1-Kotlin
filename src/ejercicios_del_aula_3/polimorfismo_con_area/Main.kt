package ejercicios_del_aula_3.polimorfismo_con_area

import kotlin.math.PI



open class FiguraGeometrica(val nombre: String) {
    fun imprimirNombre() {
        println("Soy una figura: $nombre")
    }
    open fun calcularArea(): Double{
        return 0.0
    }
}


class Circulo(nombre: String, val radio: Double) : FiguraGeometrica(nombre) {
    override fun calcularArea(): Double {
        return PI * radio * radio
    }
}

class Cuadrado(nombre: String, val lado: Double) : FiguraGeometrica(nombre) {
    override fun calcularArea(): Double {
        return lado * lado
    }
}
    fun main() {
        val miCirculo = Circulo("Círculo", 5.0)
        val miCuadrado = Cuadrado("Cuadrado", 4.0)

        miCirculo.imprimirNombre()
        miCuadrado.imprimirNombre()

        val figuras: List<FiguraGeometrica> = listOf(miCirculo, miCuadrado)

        for (figura in figuras) {
            figura.imprimirNombre()
            println("Área: ${figura.calcularArea()}")
            println()
        }
    }


