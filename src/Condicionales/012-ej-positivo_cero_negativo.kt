package Condicionales

fun main () {
    println("Ingresa un numero")
    val num = readln().toInt()

    if (num > 0) {
        println("El numero es positivo")
    }

    if (num === 0) {
        println("El numero es 0")
    }

    if (num < 0) {
        println("El numero es negativo")
    }
}