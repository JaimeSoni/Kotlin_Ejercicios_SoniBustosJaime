package Condicionales

fun main() {
    println("Ingresa el primer numero:")
    val n1 = readLine()!!.toDouble()

    println("Ingresa el segundo numero:")
    val n2 = readLine()!!.toDouble()

    println("Ingresa el tercer numero:")
    val n3 = readLine()!!.toDouble()

    val numeros = listOf(n1, n2, n3).sorted()

    println("El orden es el siguiente: $numeros")
}