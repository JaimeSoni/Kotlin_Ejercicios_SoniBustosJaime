package Variables_Y_Tipos_De_Datos

fun main () {
    println("Ingresa tus metros")
    val mts = readln().toDouble()

    val conversion = mts / 1000

    println("El equivalente a km son: $conversion")
}