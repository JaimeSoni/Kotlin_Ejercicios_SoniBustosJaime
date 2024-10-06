package Condicionales

fun main () {
    println("Ingresa el año")
    val año = readln().toInt()

    if ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0)) {
        println("El año $año si es un año bisiesto")
    } else {
        println("El año $año no es año bisiesto")
    }
}