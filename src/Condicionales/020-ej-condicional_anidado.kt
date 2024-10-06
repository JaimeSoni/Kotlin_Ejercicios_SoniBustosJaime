package Condicionales

fun main() {
    println("Ingresa un numero del 1 al 12:")
    val mes = readLine()!!.toInt()

    val Meses = when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Fuera del rango"
    }
    println("El mes es: $Meses")
}