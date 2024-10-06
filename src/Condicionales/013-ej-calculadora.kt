package Condicionales

fun main () {
    println("Ingresa un numero")
    val n1 = readln().toInt()

    println("Ingresa otro numero")
    val n2 = readln().toInt()

    println("Selecciona una opcion:")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicacion")
    println("4. Division")

    when (readln().toInt()) {
        1 -> {
            val op1 = n1 + n2
            println("La suma es: $op1")
        }

        2 -> {
            val op2 = n1 - n2
            println("La resta es: $op2")
        }

        3 -> {
            val op3 = n1 * n2
            println("La multiplicacion es: $op3")
        }

        4 -> {
            val op4 = n1 / n2
            println("La division es: $op4")
        }

        else -> {
            println("Opcion no encontrada")
        }
    }
}