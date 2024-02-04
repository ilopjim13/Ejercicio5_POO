
fun main() {
    var t:Tiempo
    var h: Int = 0
    var m: Int = 0
    var s: Int = 0
    try {
        print("Introduce hora: ")
        h = readln().toInt()
        print("Introduce minutos: ")
        m = readln().toInt()
        print("Introduce segundos: ")
        s = readln().toInt()
    } catch (e:NumberFormatException) {
        println("Error")
    }
    catch (e:IllegalArgumentException) {
        println("Los minutos y los segundos deben ser menor a 59")
    }
    val hora = Tiempo(h,m,s)
    println(hora)


    try {
        print("Introduce hora: ")
        h = readln().toInt()
        print("Introduce minutos: ")
        m = readln().toInt()
        print("Introduce segundos: ")
        s = readln().toInt()
    } catch (e:NumberFormatException) {
        println("Error")
    }
    catch (e:IllegalArgumentException) {
        println("Los minutos y los segundos deben ser menor a 59")
    }
    t = Tiempo(h,m,s)
    if (hora.incrementar(t)) println("La hora incrementada: $hora")
    else println("**ERROR** La hora incrementada se pasa de las 23:59:59")



//    try {
//        print("Introduce hora: ")
//        h = readln().toInt()
//        print("Introduce minutos: ")
//        m = readln().toInt()
//        print("Introduce segundos: ")
//        s = readln().toInt()
//    } catch (e:NumberFormatException) {
//        println("Error")
//    }
//    catch (e:IllegalArgumentException) {
//        println("Los minutos y los segundos deben ser menor a 59")
//    }
//    t = Tiempo(h,m,s)
    if (hora.decrementar(t)) println("La hora decrementada es de $hora")
    else println("**ERROR** La hora decrementada se pasa de las 00:00:00")


//    try {
//        print("Introduce hora: ")
//        h = readln().toInt()
//        print("Introduce minutos: ")
//        m = readln().toInt()
//        print("Introduce segundos: ")
//        s = readln().toInt()
//    } catch (e:NumberFormatException) {
//        println("Error")
//    }
//    catch (e:IllegalArgumentException) {
//        println("Los minutos y los segundos deben ser menor a 59")
//    }
//    t = Tiempo(h,m,s)
    if (hora.comparar(t) == 0) println("Las horas son iguales")
    else if (hora.comparar(t) == 1) println("$hora es mayor que $t")
    else println("$hora es menor que $t")



    val copia1 = hora.copiar()
    println("Esta es la hora $hora y esta su copia $copia1")



//    try {
//        print("Introduce hora: ")
//        h = readln().toInt()
//        print("Introduce minutos: ")
//        m = readln().toInt()
//        print("Introduce segundos: ")
//        s = readln().toInt()
//    } catch (e:NumberFormatException) {
//        println("Error")
//    }
//    catch (e:IllegalArgumentException) {
//        println("Los minutos y los segundos deben ser menor a 59")
//    }
//    t = Tiempo(h,m,s)
    val copia2 = hora.copiar(t)
    println("Esta es la hora $hora y esta su copia $copia2")


//    try {
//        print("Introduce hora: ")
//        h = readln().toInt()
//        print("Introduce minutos: ")
//        m = readln().toInt()
//        print("Introduce segundos: ")
//        s = readln().toInt()
//    } catch (e:NumberFormatException) {
//        println("Error")
//    }
//    catch (e:IllegalArgumentException) {
//        println("Los minutos y los segundos deben ser menor a 59")
//    }
//    t = Tiempo(h,m,s)

    val sumada = hora.sumar(t)
    println(sumada)



//    try {
//        print("Introduce hora: ")
//        h = readln().toInt()
//        print("Introduce minutos: ")
//        m = readln().toInt()
//        print("Introduce segundos: ")
//        s = readln().toInt()
//    } catch (e:NumberFormatException) {
//        println("Error")
//    }
//    catch (e:IllegalArgumentException) {
//        println("Los minutos y los segundos deben ser menor a 59")
//    }
//    t = Tiempo(h,m,s)

    val restada = hora.restar(t)
    println(restada)


//    try {
//        print("Introduce hora: ")
//        h = readln().toInt()
//        print("Introduce minutos: ")
//        m = readln().toInt()
//        print("Introduce segundos: ")
//        s = readln().toInt()
//    } catch (e:NumberFormatException) {
//        println("Error")
//    }
//    catch (e:IllegalArgumentException) {
//        println("Los minutos y los segundos deben ser menor a 59")
//    }
//    t = Tiempo(h,m,s)

    if (hora.esMayorQue(t)) println("$hora es mayor que $t")
    else println("$hora no es mayor que $t")


//    try {
//        print("Introduce hora: ")
//        h = readln().toInt()
//        print("Introduce minutos: ")
//        m = readln().toInt()
//        print("Introduce segundos: ")
//        s = readln().toInt()
//    } catch (e:NumberFormatException) {
//        println("Error")
//    }
//    catch (e:IllegalArgumentException) {
//        println("Los minutos y los segundos deben ser menor a 59")
//    }
//    t = Tiempo(h,m,s)

    if (hora.esMenorQue(t)) println("$hora es menor que $t")
    else println("$hora no es menor que $t")
}