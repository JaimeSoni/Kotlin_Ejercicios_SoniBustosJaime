package Condicionales

fun main() {
    println("Ingresa un numero:")
    val num1 = readLine()!!.toInt()

    println("Ingresa otro numero:")
    val num2 = readLine()!!.toInt()

    var res = 0

    for (i in 1..num2) {
        res += num1
    }

    println("El resultado es: $res")
}