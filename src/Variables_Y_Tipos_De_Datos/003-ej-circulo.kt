package Variables_Y_Tipos_De_Datos

fun main() {
    val pi = 3.1416

    println("Ingresa la medida del radio")
    val radio = readln().toInt()

    val operacion = (radio * radio) * pi

    println("El area es: $operacion")
}