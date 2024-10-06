package Bucles

fun main() {
    println("Ingresa un numero:")
    val n = readLine()!!.toInt()

    var factorial = 1

    for (i in 1..n) {
        factorial *= i
    }

    println("Su factorial es: $factorial")
}