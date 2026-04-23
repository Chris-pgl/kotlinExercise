fun tipiNullable(){
    println("\n---Null safety----\n")
    println("\n---Tipi Nullable----\n")

    /* String = non può MAI essere null
     * String? = può essere null, ma si DEVE gestire esplicitamente
     * 
     * **/
    val nome: String = "Paperina" //qui non c'è l'operatore ? quindi non può essere null
    var email: String? = null //può essere null perché c'è l'operatore ?
    //val email: String = null
    
    println(nome)
    println(email)
    
}
fun safeCallOperator() {
     println("\n---Safe call operator ?.----\n")
    /*?. è il nostro migliore amiche, perché se l'oggetto è null,
     * l'intera espressione diventa null invece di crashare.
     * Accede a una proprietà SOLO se il valore non è null.
     **/
     val testo: String? = "Ciao Kotlin "
     val nullo: String? = null
     
    println(testo?.length)
    println(nullo?.length)
    
}
fun elvisOperator(){
    println("\n---Elvis Operator ?:----\n")
    /* ?: fornisce un valore di default quando qualcosa è null.
     * Si chiama Elvis perché ?: da un lato somiglia al ciuffo
     * di Elvis Presley.
     * Sintassi: val result=nullable?: "defaultValue"
     * */
    val testo: String? = null
    
    val lunghezza = testo?.length ?: 0
    println("Lunghezza (0 se null): $lunghezza") 

    val messaggio = testo ?: "Testo non disponibile"
    println("Messaggio: $messaggio")

    // Elvis con return
    fun processa(input: String?) {
        val valore = input ?: return  // esce subito se null
        println("Processing: $valore")
    }

    processa("Ciao")   // stampa
    processa(null)     // esce silenziosamente
}

fun combinazioneSafeAndElvis() {
	val cognome: String? = null // stampa: Anonimo
    //val cognome: String? = "Brancaleone"
    println("Salve, ${cognome ?: "Anonimo/a"}!")
}

fun notNullAssertion(){
    println("\n---Not-null Assertion Operator !!----\n")
    /* "!!" ed è il modo per dire al compilatore "guarda, ti puoi fidare di me,
     * so che questo parametro, valore, firma, quello che vuoi tu, non è null".
     * SE abbiamo torto, l'app crasha con "NullPointerException".
     * Piccolo consiglio: bisogna usarlo raramente. Ogni volta che utilizzeremo
     * "!!" chiediamoci sempre "Sono d'accordo al 100% con questa mia scelta?"
     * Sintassi:
     * val length = text!!.length
     * **/
    val parola: String? = "Supercalifragilistichespiralidoso"
    println(parola!!.length)
    
    val nulla: String? = null
    //println(nulla!!.length)-> così crasherebbe
    println(nulla?.length ?: 0)
}

fun main() {
	
    tipiNullable()
    safeCallOperator()
    elvisOperator()
    combinazioneSafeAndElvis()
    notNullAssertion()
}