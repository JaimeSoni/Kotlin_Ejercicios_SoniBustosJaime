package Condicionales

fun main () {
    println("Ingresa tu edad")
    val edad = readln().toInt()

    if (edad > 18) {
        println("Ya puedes votar y chelear")
    } else if (edad < 18) {
        println("Todavia no puedes chavo")
    }
}