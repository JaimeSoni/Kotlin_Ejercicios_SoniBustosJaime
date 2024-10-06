package Bucles

fun main() {
    println("Ingresa un numero n:")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        if (i % 2 == 0) println(i)
    }
}