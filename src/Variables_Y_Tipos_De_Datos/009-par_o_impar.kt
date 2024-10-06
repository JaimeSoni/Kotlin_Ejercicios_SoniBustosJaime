package Variables_Y_Tipos_De_Datos

fun main () {
    println("Ingresa un numero")
    val num = readln().toInt()

    if (num % 2 === 0) {
        println("El numero es par")
    } else {
        println("El numero es impar")
    }
}