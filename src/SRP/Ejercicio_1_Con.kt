package SRP

import SRP.Sin.Producto

class Producto(val nombre: String, val Precio: Double)

class ProductoDescuento {
    fun calculardescuento(producto: Producto ,porcentaje: Double): Double{
        return producto.precio - (producto.precio * porcentaje / 100)
    }
}

class ProductoPrinter{
    fun imprimirDetalles(producto: Producto){
        println("Producto: ${producto.nombre}, Precio: $${producto.precio}")
    }
}

fun main(){
    val producto = Producto("Laptop", 1500.0)
    println("Precio con descuento:${producto.calcularDescuento(10.0)}")
    producto.imprimirDetalles()


}


//las funciones que anteriormente estaban en una sola clase ahora son 3 clases cada una con su funcion correspondente