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




}