package Arreglos_Y_Cadenas

fun main() {
    val numeros = arrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5)

    val repetidos = numeros.groupBy { it }.filter { it.value.size > 1 }.keys

    println("Los repetidos son: $repetidos")
}