package SRP

import Actividad_Didactica.SRP.Cliente

class cliente(val nombre: String, val edad: Int)


class guardarcliente{
    fun guardarCliente() {
        println("Guardando cliente en la base de datos...")
    }
}


class enviarcorreo{
fun enviarCorreo(cliente1: cliente) {
    println("Enviando correo a ${cliente1.nombre}")
}
}
fun main() {
    val cliente = Cliente("Carlos", 28)
    cliente.guardarCliente()
    cliente.enviarCorreo()
}