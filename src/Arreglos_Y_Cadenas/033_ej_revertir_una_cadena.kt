package Arreglos_Y_Cadenas

fun main() {
    println("Ingresa una palabra:")
    val palabra = readLine()!!

    val revertir = palabra.reversed()

    println("Invertida es: $revertir")
}