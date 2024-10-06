package Arreglos_Y_Cadenas

fun main() {
    println("Ingresa una palabra en mayusculas:")
    val palabra = readLine()!!

    val minusculas = palabra.lowercase()

    println("En minusculas es: $minusculas")
}