package Condicionales

fun main () {
    println("Ingresa la calificacion obtenida")
    val cal = readln().toInt()

    if (cal == 100) {
        println("Tu tienes una A")
    }

    if (cal >= 80 && cal <= 99) {
        println("Tienes una B")
    }

    if (cal >= 60 && cal <= 79) {
        println("Tienes una C")
    }

    if (cal >= 30 && cal <= 59) {
        println("Tienes una D")
    }

    if (cal >= 0 && cal <= 29) {
        println("Tienes una F")
    }
}