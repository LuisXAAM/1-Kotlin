package ejercicios_del_aula_3.herencia_y_Llamadas

 open class Vehiculo {
    open fun describir (){
        println("Este es un vehiculo generico")
    }
}

class coche:Vehiculo (){
    override fun describir(){
        super.describir()
        println("Más específicamente, un coche de 4 ruedas")
    }
}

fun main(){
    val micoche =coche()
    micoche.describir()
}
