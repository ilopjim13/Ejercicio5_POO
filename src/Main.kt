
fun main() {
    val hora1 = Tiempo(1)
    print("Introduce la hora: ")
    hora1.hora = readln().toInt()
    print("Introduce los minutos: ")
    hora1.setMinutos(readln())
    print("Introduce los segundos: ")
    hora1.setSegundos(readln())

    println(hora1.toString())

    val hora2 = Tiempo(1,2)
    println(hora2.toString())

    val hora3 = Tiempo(1,2,3)
    println(hora3.toString())
}