package Bucles

fun main() {
    println("Ingresa una cantidad grande:")
    val num = readLine()!!.toInt()

    val cantidad = num.toString().length

    println("Tiene $cantidad digitos la cantidad")
}