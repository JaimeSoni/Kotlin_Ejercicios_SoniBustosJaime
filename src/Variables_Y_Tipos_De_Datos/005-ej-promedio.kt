package Variables_Y_Tipos_De_Datos

fun main () {
    println("Ingresa la primer calificacion")
    val c1 = readln().toDouble()

    println("Ingresa la segunda calificacion")
    val c2 = readln().toDouble()

    println("Ingresa la tercer calificacion")
    val c3 = readln().toDouble()

    val promedio = (c1 + c2 + c3) / 3

    println("Tu promedio es: $promedio")
}