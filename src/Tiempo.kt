class Tiempo (hora:Int) {
    var hora:Int = hora
    private var minutos:Int = 0
        set(value) {
            require(value in 0..59)
            field = value
        }
    private var segundos:Int = 0
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

    constructor(hora: Int, minutos: Int) : this(hora) {
        this.minutos = minutos
    }

    constructor(hora: Int, minutos: Int, segundos: Int) : this(hora) {
        this.minutos = minutos
        this.segundos = segundos
    }

    override fun toString(): String {
        return "${this.hora}h ${this.minutos}m ${this.segundos}s"
    }

    fun incrementar(t:Tiempo) : Boolean {
        val h = t.hora
        val m = t.minutos
        val s = t.segundos
        if (s > 59) {
            this.minutos += s/60
            this.segundos %= 60
        }

        if (m > 59) {
            this.hora += m/60
            this.minutos %= 60
        }

        return if (this.hora + h > 23) false

        else{
            this.hora += h
            return true
        }
    }

    //fun decrementar(t:Tiempo): Boolean {
    //}

    fun comparar(t:Tiempo):Int {
        if (this.hora == t.hora && this.minutos == t.minutos && this.segundos == t.segundos) return 0
        return 5
    }




}