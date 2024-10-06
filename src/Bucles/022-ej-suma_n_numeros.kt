package Bucles

fun main() {
    println("Ingresa una cantidad de numeros:")
    val n = readLine()!!.toInt()

    val suma = (1..n).sum()

    println("La suma de los $n numeros es: $suma")
}