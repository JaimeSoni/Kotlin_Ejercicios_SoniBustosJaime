package Variables_Y_Tipos_De_Datos

fun main () {
    println("Ingresa un numero")
    val n1 = readln().toDouble()

    println("Ingresa otro numero")
    val n2 = readln().toDouble()

    var operacion = n1 + n2

    println("La suma es: $operacion")
}