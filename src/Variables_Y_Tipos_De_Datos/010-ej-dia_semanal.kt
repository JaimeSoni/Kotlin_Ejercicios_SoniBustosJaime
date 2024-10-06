package Variables_Y_Tipos_De_Datos

fun main () {
    println("Ingresa un numero")
    val dia = readln().toInt()

    when (dia) {
        1 -> println("Es Lunes")
        2 -> println("Es Martes")
        3 -> println("Es Miercoles")
        4 -> println("Es Jueves")
        5 -> println("Es Viernes")
        6 -> println("Es Sabado")
        7 -> println("Es Domingo")
    }
}