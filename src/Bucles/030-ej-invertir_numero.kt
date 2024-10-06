package Bucles

fun main() {
    println("Ingresa un numero:")
    val num = readLine()!!.toInt()

    val invertir = num.toString().reversed().toInt()

    println("Invertido es: $invertir")
}