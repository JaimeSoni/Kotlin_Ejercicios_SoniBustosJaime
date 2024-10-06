package Variables_Y_Tipos_De_Datos

fun main () {
    println("Ingresa los grados a convertir")
    val temp = readln().toDouble()

    val conversion = (temp * 9) / 5 + 32

    println("La conversion es $conversion")
}