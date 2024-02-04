class Tiempo (var hora:Int, minutos: Int = 0, segundos: Int = 0) {

    private var minutos:Int = minutos
        set(value) {
            require(value in 0..59)
            field = value
        }
    private var segundos:Int = segundos
        set(value) {
            require(value in 0..59)
            field = value
        }

    init {
        require(this.hora in 0..23) {"La hora no puede ser mayor a 23"}

        if (this.minutos> 59) {
            this.hora += this.minutos/60
            this.minutos %= 60
        }

        if (this.segundos> 59) {
            this.minutos += this.segundos/60
            this.segundos %= 60
        }
    }

    /**
     * Imprime la informacion de la hora
     * @return String con la informacion de la hora
     */
    override fun toString(): String {
        return "${this.hora}h ${this.minutos}m ${this.segundos}s"
    }

    /**
     * Incrementa la hora y retorna true si la hora no pasa de 23:59:59 o false si se pasa
     * @param t :Tiempo tiempo que va a incrementar
     * @return Boolean true si la hora pasa no se pasa de 23:59:59 y false si se pasa
     */
    fun incrementar(t:Tiempo) : Boolean {
        val total = (this.hora * 3600) + (this.minutos * 60) + this.segundos
        val total2 = (t.hora * 3600) + (t.minutos * 60) + t.segundos

        if (total + total2 <= 86399) {
            val totalFinal = total + total2
            this.hora = totalFinal/3600
            this.minutos = (totalFinal % 3600) / 60
            this.segundos = totalFinal % 60
            return true
        } else return false
    }

    /**
     * Decrementa la hora y retorna true si la hora no pasa de 00:00:00 o false si se pasa
     * @param t :Tiempo tiempo que va a decrementar
     * @return Boolean true si la hora pasa no se pasa de 00:00:00 y false si se pasa
     */
    fun decrementar(t:Tiempo): Boolean {
        val total = (this.hora * 3600) + (this.minutos * 60) + this.segundos
        val total2 = (t.hora * 3600) + (t.minutos * 60) + t.segundos

        if (total - total2 > 0) {
            val totalFinal = total - total2
            this.hora = totalFinal/3600
            this.minutos = (totalFinal % 3600) / 60
            this.segundos = totalFinal % 60
            return true
        }
        else return false
    }

    /**
     * Compara si las dos horas son iguales o cual es mayor
     * @param t :Tiempo tiempo que va a comparar
     * @return Int numero correspondiente a si es menor, mayor o igual
     */
    fun comparar(t:Tiempo):Int {
        val segundos1 = (this.hora * 3600) + (this.minutos * 60) + this.segundos
        val segundos2 = (t.hora * 3600) + (t.minutos * 60) + t.segundos
        return if (segundos1 == segundos2) 0
        else if (segundos1 > segundos2) 1
        else -1
    }


    /**
     * Copia la hora principal y devuelve la copia
     * @return Tiempo retorna la hora copiada
     */
    fun copiar():Tiempo {
        val h = this.hora
        val m = this.minutos
        val s = this.segundos
        return Tiempo(h,m,s)
    }

    /**
     * Copia la hora que se le pasa y devuelve una copia
     * @param t :Tiempo tiempo que se va a copiar
     * @return Tiempo retorna la hora copiada
     */
    fun copiar(t:Tiempo) :Tiempo {
        val h = t.hora
        val m = t.minutos
        val s = t.segundos
        return Tiempo(h, m, s)
    }

    /**
     * Suma las dos horas y devuelve la hora sumada o un nulo si se pasa de 23:59:59
     * @param t :Tiempo tiempo que se va a sumar
     * @return Tiempo? devuelve un objeto Tiempo o un nulo
     */
    fun sumar(t:Tiempo) :Tiempo? {
        val total = (this.hora * 3600) + (this.minutos * 60) + this.segundos
        val total2 = (t.hora * 3600) + (t.minutos * 60) + t.segundos

        if (total + total2 <= 86399) {
            val totalFinal = total + total2
            this.hora = totalFinal/3600
            this.minutos = (totalFinal % 3600) / 60
            this.segundos = totalFinal % 60
            return Tiempo(this.hora, this.minutos, this.segundos)
        } else return null
    }

    /**
     * Resta las dos horas y devuelve la hora sumada o un nulo si se pasa de 00:00:00
     * @param t :Tiempo tiempo que se va a restar
     * @return Tiempo? devuelve un objeto Tiempo o un nulo
     */
    fun restar(t:Tiempo):Tiempo? {
        val total = (this.hora * 3600) + (this.minutos * 60) + this.segundos
        val total2 = (t.hora * 3600) + (t.minutos * 60) + t.segundos

        if (total - total2 > 0) {
            val totalFinal = total - total2
            this.hora = totalFinal/3600
            this.minutos = (totalFinal % 3600) / 60
            this.segundos = totalFinal % 60
            return Tiempo(this.hora, this.minutos, this.segundos)
        }
        else return null
    }

    /**
     * Compara si la hora es mayor que la otra
     * @param t :Tiempo tiempo que se va comparar
     * @return Boolean si el tiempo es mayor devuelve true si no false
     */
    fun esMayorQue(t:Tiempo):Boolean {
        return this.comparar(t) == 1
    }

    /**
     * Compara si la hora es menor que la otra
     * @param t :Tiempo tiempo que se va comparar
     * @return Boolean si el tiempo es menor devuelve true si no false
     */
    fun esMenorQue(t:Tiempo) :Boolean {
        return this.comparar(t) == -1
    }
}