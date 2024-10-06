package Condicionales

fun main () {
    println("Ingresa un numero")
    val n1 = readln().toInt()

    println("Ingresa otro numero")
    val n2 = readln().toInt()

    if (n1 > n2) {
        println("El $n1 es mayor que el $n2")
    } else if (n2 > n1) {
        println("El $n2 es mayor que el $n1")
    } else {
        println("Los dos son iguales")
    }
}