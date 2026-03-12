package esercitazioniClassEtc

/**
 * Per estendere l'ereditarietà della classe madre alla classe figlia
 * si richiema la classe madre ( dove c'è - open -)
 * bisogna fare un override dei dati della classe madre
 */
class ContoBancaSella(override val name:String,
                      override val lastName:String,
                      override var saldoIniziale:Int = 0):ContoBancario(name,lastName,saldoIniziale){
    /**
     * Nota-
     * Se c'è un init nella classe madre, verà eseguito prima quello
     * quindi bisogna stare attenti ai vari costruttori e init della classe madre
     * prima di estenderla alla classe figlio
     */
      init {
          println("Creazione Conto banca Sella")
      }

    override fun scriviLog() {
        println("--- Log Banca Sella")
    }

    override val endpointSitoWeb: String
        get() = "Http://esercitazioniClassEtc.ContoBancaSella.."

    override fun preleva(importo: Int) {
        super.preleva(importo)
        println("L'utente $name ha prelavato $importo€")
    }


}

class ContoIntesaSanPaolo(override val name:String,
                          override val lastName:String,
                          override var saldoIniziale:Int = 0):ContoBancario(name,lastName,saldoIniziale){
       init {
           println("Creazione conto Intesa SanPaolo")
       }

    override fun scriviLog() {
        println("--- Log ISP --")
    }

    override val endpointSitoWeb: String
        get() = "Http://BancaIntesaSanPaolo.."


}


/**
 * Per estendere l'ereditarietà di una classe a una classe figlia si usa
 * open - sulla classe madre e su i dati di parametro che vogliamo trasferire
 *
 */
abstract class ContoBancario(open val name:String, open val lastName:String, open var saldoIniziale:Int = 0){
    var saldo: Int = saldoIniziale

    //metodi astratti di classe astratte verranno overridate in classe figlie
    abstract fun scriviLog()
    abstract val endpointSitoWeb: String

    companion object{
        fun convertiInDollari(soldiInEuro:Int): Double = soldiInEuro*1.19
    }

    init{
        println("Creato nuovo conto a nome di $name $lastName, $saldo€")
    }

    constructor(name:String, lastName:String): this(name, lastName,0)

    /**
     *   modificatore inflix per migliorare la leggibilità
     *   con le funzioni con un solo parametro
     */

    open infix fun preleva(importo:Int){
        if(importo <= 0){
            println("Errore: Impossibile prelevare ")
        }
        if(saldo < importo){
            println("Errore: tentativo di prelievo $importo€, ma non ci sono abbastanza soldi.")
        }
        else{
            saldo -= importo
            println("Prelevati: $importo€ da $name")
        }
    }

    /**
     *   modificatore inflix per migliorare la leggibilità
     *   con le funzioni con un solo parametro
     */
    infix fun deposita(importo:Int){
        if(importo <= 0){
            println("Errore: Impossibile depositare")
            return
        }
        saldo += importo
        println("Depositati: $importo€ sul conto di $name")
    }

    fun stampaSaldo(){
        println("Saldo attuale di $name: $saldo€")
    }

    fun mostraSaldoInDollari() =
        println("Saldo: $saldo€ converito in $ = " + convertiInDollari(saldo) +"$")

    /**
     * Metodo equals per sapere se un esercitazioniClassEtc.ContoBancario è uguale a uno simile
     */
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        other as ContoBancario
        if (other.name != this.name) return false
        if (other.lastName != this.lastName) return false
        if (other.saldo != this.saldo) return false
        return true
    }

    override fun toString(): String = name + " " + lastName + " " + saldo+"€"
}

fun main() {

    /*val conto1 = esercitazioniClassEtc.ContoBancario("Mario","Rossi", 1000)
    conto1.preleva(100)
    conto1.stampaSaldo()
    conto1.deposita(200)
    conto1.stampaSaldo()
    conto1.preleva(2000)

    val conto2 = esercitazioniClassEtc.ContoBancario("Luca","Verdi")
    conto2.preleva(100)
    conto2.deposita(200)
    conto2.mostraSaldoInDollari()

    val conto3 = esercitazioniClassEtc.ContoBancario("Chris","Pugli",500)
    val conto4 = esercitazioniClassEtc.ContoBancario("Chris","Pugli",500)
    //senza l'override di equals sarebbe false, perché fa riferimento a due istanze diverse malgrado siano uguali
    println(conto3 == conto4)

    /**
     * grazie al infix possiamo concatenare le funzioni con un parametro direttamente
     * quindi a posto di
     * conto1.deposita(100)
     * possiamo scrivere
     */
    conto1 deposita 100
    println(conto1)

     */

    /**
     * Nota-
     * Se c'è un init nella classe madre, verà eseguito prima quello
     * quindi bisogna stare attenti ai vari costruttori e init della classe madre
     * prima di estenderla alla classe figlio
     */
    println("------ estensione classe esercitazioniClassEtc.ContoBancario a esercitazioniClassEtc.ContoBancaSella ---------")
    var contoS = ContoBancaSella("Gino","Pippo")
    contoS deposita 1000
    contoS preleva 100

}