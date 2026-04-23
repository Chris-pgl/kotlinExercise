fun main() {
    println("---------------------Booleano caso studio--------------------------\n")
    /* Esempio realistico per l'uso di un booleano.
     * Come sappiamo, un valore booleano rappresenta una condizione binaria:
     * può essere solo true (vero) o false (false).
     * Viene usato molto per controllare lo stato di qualcosa.
     * Usiamo un booleano per controllare se l'utente ha attivato la darkmode**/
    val isDarkModeEnabled = false
    val statusDarkMode =
    //Stampare on e off al posto di true e false con l'uso di if
    if (isDarkModeEnabled) {
        "on"
    } else {
        "off"
    }
    //Stampiamo un messaggio descrittivo
    println("Modalità scura attivata: $statusDarkMode")
    println("\n---------------------Booleano come risultato di un'espressione--------------------------\n")
    /*I booleani possono essere anche il risultato di un confronto.
     * Poniamo il caso del classico livello di batteria del telefono che, al di sotto di una soglia, si attiverà
     * il risparmio energetico della batteria.
     * */
     val livelloBatteria = 15
     
     //Boolean che ci indica il livello di batteria sotto il quale scatterà il risparmio energetico
    val isBatteriaBassa = livelloBatteria <= 15
    println("Livello batteria basso: $isBatteriaBassa. Batteria al " + livelloBatteria + "%")
    
    val risparmioEnergetico =
    	if (isBatteriaBassa) {
            "attivo" // risparmio energetico attivo
        } else {
            "disattivato" // risparmio energetico disattivato
        }
     
     println("Modalità risparmio energetico: $risparmioEnergetico. Batteria al "+ livelloBatteria + "%")
          
}