/**
 * Interfacce -
 *
 */



interface PersonaInterface{
    val nome:String
    val cognome:String
    fun parla():String
}

class Impiegato : PersonaInterface{

    override val nome:String = "Mario"
    override val cognome:String = "ROssi"
    override fun parla(): String = "Ciao sono l'impiegato $nome $cognome!"

}
class Pompiere : PersonaInterface{

    override val nome:String = "Lino"
    override val cognome:String = "IlPompiere"
    override fun parla(): String = "Ciao sono il pompiere $nome $cognome!"
    fun spegneFuoco(){}

}

fun main(){

    val impiegato:Impiegato
    val pompiere:Pompiere

    val persona1 :PersonaInterface = Impiegato()
    val persona2 :PersonaInterface = Pompiere()
}



