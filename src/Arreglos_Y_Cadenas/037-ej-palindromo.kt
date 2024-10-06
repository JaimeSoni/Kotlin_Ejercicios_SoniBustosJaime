package Arreglos_Y_Cadenas

fun main() {
    println("Ingresa una palabra:")
    val palabra = readLine()!!.lowercase()

    val palindormo = palabra == palabra.reversed()

    if (palindormo) {
        println("La palabra si es palindromo")
    } else {
        println("La palabra no es palindromo")
    }
}