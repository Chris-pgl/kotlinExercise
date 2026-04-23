/* Il costruttore primario è INLINE nella dichiarazione.
 * val e var vanno davanti al parametro, quindi diventa automaticamente
 * una proprietà della classe. Anche getter verrà generato automaticamente.
 * Sintassi:
 * class Persona(val nome: String, val eta: Int) {
 *  constructor(nome: String) :this(nome, 0)
 * }
 * Con la keyword "constructor" definiamo i costruttori secondari, i quali
 * devono sempre rifarsi al primo costruttore tramite this().
 * 
 * NOTARE BENE:
 * - Il costruttore primario è la firma della classe. Se serve logica aggiuntiva,
 * si aggiunge "init".
 * - I costruttori secondari esistono, MA sono rari in Kotlin perché
 * i parametri di default spesso li sostituiscono
 * **/
 class PrimarioSecondario(val nome: String, val eta: Int) {
    constructor(nome: String): this(nome, 0)
    /* Il costruttore secondario fornisce un default per l'età.
     * Il this richiama il costruttore primario con eta=0
     * **/
}
fun main() {
    println("\n-----\n")
    println("\n---Costruttori primari e secondari---\n")
    val padme = PrimarioSecondario("Padme", 4) //primario
    val anya = PrimarioSecondario("Anya") //secondario
	println(padme.nome)
    println(anya.eta)
}