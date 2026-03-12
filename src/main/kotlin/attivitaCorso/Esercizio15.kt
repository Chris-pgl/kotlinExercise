package attivitaCorso

interface Smartphone{
    fun takePhoto(){
        println("Scatto lo smartphone")
    }
}


interface Camera{
    fun takePhoto(){
        println("Scatto con fotocamera")
    }
}

class Iphone: Smartphone, Camera{
    override fun takePhoto(){
        super<Camera>.takePhoto()
        super<Smartphone>.takePhoto()
    }
}

//ese2---------------
class Car(){
    var brand = ""
    var model = ""
    init {
        println("Creata nuova auto: $brand $model")
    }
}

fun main() {
    //ese1------
    val iphone = Iphone()
    iphone.takePhoto()

    //ese2------
    val car = Car().apply{
        brand = "Ford"
        model = "Mustang"
    }

    val nullable:String? = "kotlin"
    nullable?.let{
        println(it.uppercase())
    }

    //ese3-------
    fun operazioneSuNumeri(a: Int, b: Int, operazione: (Int, Int) -> Int): Int {
        return operazione(a, b)
    }

    val risultato = operazioneSuNumeri(4,5){
            a,b -> a*b
    }
    println(risultato)

    val voti = listOf(18,25,30,15)

    val votiValidi = voti.filter{it >=19}
    println(votiValidi)
}



