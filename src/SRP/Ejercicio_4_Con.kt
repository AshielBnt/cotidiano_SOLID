package SRP


interface MetodoEnvio {
    fun enviar(archivo: String)
}


class EnvioFTP : MetodoEnvio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
    }
}

class EnvioHTTP : MetodoEnvio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
    }
}


class ServicioDeEnvio {
    fun enviar(archivo: String, metodo: MetodoEnvio) {
        metodo.enviar(archivo)
    }
}


fun main() {
    val servicio = ServicioDeEnvio()

    val envioFTP = EnvioFTP()
    val envioHTTP = EnvioHTTP()

    servicio.enviar("documento.txt", envioFTP)
    servicio.enviar("documento.txt", envioHTTP)
}