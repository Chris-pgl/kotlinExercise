fun connetti(host: String, porta: Int = 8080, ssl: Boolean = true) {
    println("$host : $porta SSL=$ssl")
}
fun main() {
    println("\n---Parametri nominati---\n")
    /*I parametri nominati permettono di specificare gli argomenti
     * usando il NOME del parametro invece della posizione.
     * Vantaggi:
     * - il codice diventa più leggibile
     * - possiamo cambiare l'ordine degli argomenti
     * - possiamo passare solo quelli che ci servono
     * Sintassi:
     * funzione(nome="Bruclino",eta=38,citta="Paperopoli")
     * **/
     connetti(host="server.esempio.com", ssl=false)
     /* Qui specifichiamo solo host e ssl
      * **/
      connetti(ssl = true, porta = 9090, host = "server.nerdline.net")
       /* Si può notare che l'ordine degli argomenti è libero,
        * questo sarebbe impossibile senza i parametri nominati.
        * **/
      connetti(ssl = true, porta = 9090)
      /* Caso senza specificare host, ci darà errore nell'output perché 
       * host è obbligatorio (non ha nessun default)
       * **/

}