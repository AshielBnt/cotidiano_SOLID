package SRP


interface Trabajador {
    fun trabajar()
}

interface Administrador {
    fun administrar()
}

interface Auditor {
    fun auditar()
}


class Desarrollador1 : Trabajador {
    override fun trabajar() {
        println("Desarrollando software...")
    }
}


class Gerente : Trabajador, Administrador {
    override fun trabajar() {
        println("Supervisando el trabajo del equipo...")
    }

    override fun administrar() {
        println("Administrando el equipo y recursos...")
    }
}


class AuditorInterno : Auditor {
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