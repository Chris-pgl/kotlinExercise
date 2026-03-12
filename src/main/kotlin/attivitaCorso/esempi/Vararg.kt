fun stampaMessaggi(vararg messaggi: String){
/* messaggi qui è un array e si itera con for
 * **/
	 for (m in messaggi){
     println(m)
 		}
 }
fun main() {
	println("\n---Vararg----\n")
    
    stampaMessaggi("Ciao") // 1 argomento
    stampaMessaggi("Buongiorno", "Buonasera") //2 argomenti
    stampaMessaggi("uno", "due", "tre") //3 argomenti
    stampaMessaggi() //nessun argomento, l'array è vuoto, ma la funzione funziona comunque
    println("\n---Vararg con spread operator----\n")
    /*Se abbiamo già un array e vogliamo passarlo a un var arg,
     * dobbiamo "espanderlo" usando l'operatore "*".
     * Questo trasforma l'array in una sequenza di argomenti
     * */
    val parole = arrayOf("Academy", "Kotlin", "Android")
    stampaMessaggi(*parole) //-> StampaMessaggi("Academy", "Kotlin", "Android")
    /* Senza "*" non funzionerebbe, perché vararg si aspetta singoli valori
     * e non un array intero
     * **/

}