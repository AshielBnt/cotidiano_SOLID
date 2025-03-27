
interface Grafica {
    fun dibujar()
}


class GraficaBarras : Grafica {
    override fun dibujar() {
        println("Dibujando gráfica de barras")
    }
}

class GraficaLineas : Grafica {
    override fun dibujar() {
        println("Dibujando gráfica de líneas")
    }
}


class DibujadorDeGraficas {
    fun dibujar(grafica: Grafica) {
        grafica.dibujar()
    }
}


fun main() {
    val dibujador = DibujadorDeGraficas()

    val graficaBarras = GraficaBarras()
    val graficaLineas = GraficaLineas()

    dibujador.dibujar(graficaBarras)
    dibujador.dibujar(graficaLineas)
}