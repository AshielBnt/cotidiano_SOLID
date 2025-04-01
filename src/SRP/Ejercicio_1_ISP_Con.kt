package SRP



interface Encendible1{
    fun encender()
    fun apagar()
}

interface Conectividad {
    fun conectarWifi()
}

interface Actualizable {
    fun actualizarFirmware()
}


class Lampara2 : Encendible1 {
    override fun encender() {
        println("Encendiendo la lámpara")
    }

    override fun apagar() {
        println("Apagando la lámpara")
    }
}

// Ejemplo de un dispositivo que sí tiene conectividad y actualizaciones
class SmartTv : Encendible1, Conectividad, Actualizable {
    override fun encender() {
        println("Encendiendo la Smart TV")
    }

    override fun apagar() {
        println("Apagando la Smart TV")
    }

    override fun conectarWifi() {
        println("Conectando la Smart TV a Wi-Fi")
    }

    override fun actualizarFirmware() {
        println("Actualizando el firmware de la Smart TV")
    }
}

fun main() {
    val lampara = Lampara2()
    lampara.encender()
    lampara.apagar()

    val tv = SmartTv()
    tv.encender()
    tv.conectarWifi()
    tv.actualizarFirmware()
    tv.apagar()
}