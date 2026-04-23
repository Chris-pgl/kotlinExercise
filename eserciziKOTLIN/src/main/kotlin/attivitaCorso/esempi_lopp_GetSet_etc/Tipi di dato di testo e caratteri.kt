fun main() {
    println("\n-----------Tipi di dato di testo e caratteri-----------\n")
    
    println("\n---Char---\n")
    /* Rappresenta un singolo carattere e necessita del singolo apice ''
     * **/
     val lettera: Char = 'G'
     val unicode: Char = '\u0041'
    println('\u0041'+1)
    /* kotlin lavora con caratteri unicode e in questo momento
     * stiamo usando anche l'operatore '+' su un Char
     * Qui prevarrà il testo sul valore numerico**/
    println(lettera)
    println(unicode)
    
    //Sequenza di escape
    val nuovaLinea: Char = '\n'
    val tab: Char = '\t'
    println(nuovaLinea)
    println(tab)
    
    //Come ottenere il codice numerico
    val codice: Int = lettera.code
    val letteraSuccessiva = (lettera.code + 1).toChar()
    println(codice)
    println(letteraSuccessiva)
    
    println("\n---String---\n")
    
    val nome = "Mirtilla Malcontenta" //type inference
    //val nome: String = "Mirtilla Malcontenta"
    val eta = 14 //il compilatore vede 14 e dedurrà che è :Int
    //eta = "14" -> questo creerà un errore, perché il tipo atteso è un integer
    
    /*Una caratteristica importante è lo "String templates", che permette di
     * inserire delle variabili e delle espressioni direttamente
     * all'interno del testo, usando il simbolo '$'.
     * ATTENZIONE:
     * - per le variabili semplici si usa la sintassi -> $variabile
     * - per le espressioni più complesse si usa la sintassi -> ${espressione}
     * - per le stringhe multilinea si usano le triple virgolette -> """
     * **/
    
    //Senza template 
    println("Senza template $: Ciao, io sono " + nome + ". Ho "+ eta + "anni.")

    //Con template
    println("Con template $: Ciao, io sono $nome. Ho $eta anni.")
    
    //Espressioni più complesse
    val info = "Oggi è il compleanno di $nome e compie ${eta + 1} anni."
    println(info)
    println("Il nome di $nome è composto da ${nome.length} caratteri.")
    /* .length accede alla proprietà lunghezza della stringa e 
     * ci restituisce il numero dei caratteri presenti in essa
     * **/
    
    //Stringhe multilinea
    val presentazione = """
    	Nome: $nome
        Età: $eta
        Maggiorenne: ${eta >= 18}
        """.trimIndent() //rimuove l'indentazione comune delle stringhe multilinea
        println(presentazione)
        
        
        
}
