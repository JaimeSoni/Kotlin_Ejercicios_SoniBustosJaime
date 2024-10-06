package Variables_Y_Tipos_De_Datos

fun main () {
    println("Ingresa un numero")
    val num = readln().toDouble()

    val doble = num * 2
    val mitad = num / 2

    println("Su doble es: $doble")
    println("Su mitad es: $mitad")
}