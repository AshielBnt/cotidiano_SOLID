package SRP



open class FiguraGeometrica {
    open fun calcularArea(): Int {
        return 0
    }
}


class Cuadrado(var lado: Int) : FiguraGeometrica() {
    override fun calcularArea(): Int {
        return lado * lado
    }
}


class Rectangulo(var base: Int, var altura: Int) : FiguraGeometrica() {
    override fun calcularArea(): Int {
        return base * altura
    }
}

fun main() { println("Cálculo de áreas de figuras geométricas:")
    val cuadrado = Cuadrado(4)
    val rectangulo = Rectangulo(5, 10)

    println("Área del cuadrado: ${cuadrado.calcularArea()}")
    println("Área del rectángulo: ${rectangulo.calcularArea()}")

}