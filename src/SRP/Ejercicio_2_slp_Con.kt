package SRP


interface Encendible {
    fun encender()
}


class Televisor1 : Encendible {
    override fun encender() {
        println("Encendiendo televisor...")
    }
}


class Radio1{
    fun sintonizar1() {
        println("Sintonizando radio...")
    }
}

fun main() { println("Encendiendo dispositivos:")
    val televisor = Televisor1()
    televisor.encender()
    val radio = Radio1()
    radio.sintonizar1()

}