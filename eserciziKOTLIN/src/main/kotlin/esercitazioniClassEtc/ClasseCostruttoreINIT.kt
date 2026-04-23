package esercitazioniClassEtc

class Persona(val nome:String, var age:Int){
    init {
        println("Ciao sono $nome e ho $age anni!")
    }

    override fun toString(): String {
       return "ToString: "+ "Nome:"+ nome + ", età:" +age
    }
}
fun main(){

    val mario = Persona("Mario",18)
    println(mario)
}
