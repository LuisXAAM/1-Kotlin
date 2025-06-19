package ejercicios_del_aula_3.jerarquia_empleados


open class Empleado(val nombre: String, val edad: Int, val salarioBase: Double) {

    init {
        println("Se ha registrado un nuevo empleado: $nombre")
    }


    open fun calcularSalario(): Double {
        return salarioBase
    }
}


class Gerente(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    val bono: Double
) : Empleado(nombre, edad, salarioBase) {

    override fun calcularSalario(): Double {
        return salarioBase + bono
    }
}


class Desarrollador(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    val lenguaje: String
) : Empleado(nombre, edad, salarioBase)

fun main() {
    val gerente = Gerente("Luis", 23, 300000.0, 20500.0)
    val desarrollador = Desarrollador("alfonso", 28, 25000.0, "Kotlin")

    println("\nSalario del gerente  ${gerente.nombre}: ${gerente.calcularSalario()}")
    println("Salario del desarrollador ${desarrollador.nombre}: ${desarrollador.calcularSalario()}")
}
