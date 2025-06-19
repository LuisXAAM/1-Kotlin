package ejercicios_del_aula_3.sistema_de_Notificaciones


open class Notificacion {
    open fun enviar() {
        println("Enviando notificación genérica...")
    }
}


class NotificacionEmail(val email: String, val asunto: String, val mensaje: String) : Notificacion() {
    override fun enviar() {
        println("Enviando Email a $email")
        println("Asunto: $asunto")
        println("Mensaje: $mensaje")
    }
}


class NotificacionSMS(val numeroTelefono: String, val mensaje: String) : Notificacion() {
    override fun enviar() {
        println("Enviando SMS al número $numeroTelefono")
        println("Mensaje: $mensaje")
    }
}


class NotificacionPush(val dispositivoId: String, val titulo: String, val mensaje: String) : Notificacion() {
    override fun enviar() {
        println("Enviando notificación Push al dispositivo $dispositivoId")
        println("Título: $titulo")
        println("Mensaje: $mensaje")
    }
}


fun enviarTodas(notificaciones: List<Notificacion>) {
    for (notificacion in notificaciones) {
        notificacion.enviar()
        println()
    }
}

fun main() {
    val email = NotificacionEmail("luisalfonsovilchez@gmail.com", "Bienvenida", "Gracias por registrarte.")
    val sms = NotificacionSMS("8291117916", "Tu código es 1234")
    val push = NotificacionPush("disp-001", "Alerta", "Tienes una nueva notificación.")

    val listaNotificaciones = listOf<Notificacion>(email, sms, push)

    enviarTodas(listaNotificaciones)
}
