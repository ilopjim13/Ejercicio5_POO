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
        require(this.hora in 0..24) {"La hora no puede ser mayor a 24"}

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


    fun setMinutos(minutos: String) {
        try {
            this.minutos = minutos.toInt()
            while (this.minutos >= 60) {
                this.minutos -= 60
                this.hora += 1
            }
        } catch (e:Exception) {
            println("Error los segundos introducidos no son válidos.")
            print("Introduce los segundos: ")
            this.setMinutos(readln())
        }
    }

    fun setSegundos(segundos: String) {
        try {
            this.segundos = segundos.toInt()
            while (this.segundos >= 60) {
                this.segundos -= 60
                this.minutos += 1
            }
        } catch (e:Exception) {
            println("Error los segundos introducidos no son válidos.")
            print("Introduce los segundos: ")
            this.setSegundos(readln())
        }

    }

}