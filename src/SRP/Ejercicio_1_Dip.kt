package SRP

interface Trabajador1{
    fun trabajar()
}

interface Administrador1 {
    fun administrar()
}

interface Auditor1 {
    fun auditar()
}


class Desarrollador2: Trabajador {
    override fun trabajar() {
        println("Desarrollando software...")
    }
}


class Gerente1 : Trabajador, Administrador {
    override fun trabajar() {
        println("Supervisando el trabajo del equipo...")
    }

    override fun administrar() {
        println("Administrando el equipo y recursos...")
    }
}


class AuditorInterno1 : Auditor {
    override fun auditar() {
        println("Auditando procesos internos...")
    }
}

fun main() {
    val dev = Desarrollador1()
    dev.trabajar()

    val gerente = Gerente()
    gerente.trabajar()
    gerente.administrar()

    val auditor = AuditorInterno()
    auditor.auditar()
}