package Arreglos_Y_Cadenas

fun main() {
    println("Escribe una cadena:")
    val cadena = readLine()!!

    val espacios = cadena.replace(" ", "")

    println("Sin espacios es: $espacios")
}