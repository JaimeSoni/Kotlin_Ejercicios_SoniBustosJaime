package Arreglos_Y_Cadenas

fun main() {
    println("Ingresa una palabra")
    val palabra = readLine()!!.lowercase()

    val vocales = palabra.count { it in "aeiouAEIOU" }

    println("Tiene $vocales vocales")
}