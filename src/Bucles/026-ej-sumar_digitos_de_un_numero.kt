package Bucles

fun main() {
    println("Ingresa un numero:")
    val num = readLine()!!.toInt()

    val suma = num.toString().map { it.toString().toInt() }.sum()

    println("La suma es: $suma")
}