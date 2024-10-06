package Bucles

fun main() {
    println("Ingresa algun numero:")
    val num = readLine()!!.toInt()

    for (i in 1..10) {
        println("$num por2 $i = ${num * i}")
    }
}