class PersonaConValidazione(val nome: String, val eta: Int){
    /* Il blocco init viene eseguito subito dopo il costruttore primario
     * ed è perfetto per le validazioni o i calcoli iniziali.
     * Possiamo dichiararne più di uno, successivamente verranno eseguiti nell'ordine in cui
     * appaiono nel corpo della classe.
     * require() lancia un IllegalArgumentException se la condizione
     * è falsa.
     * **/
    init {
        require(eta >= 0) {
            "L'età non può essere negativa: $eta"
            
        }
        require(nome.isNotBlank()) {
            "Il nome non può essere vuoto!"
        }
        println("Utente creato con successo: $nome, $eta")
    }
}
fun main() {
    println("\n-----\n")
    println("\n---Blocco init---\n")
    val utente = PersonaConValidazione("Anakin", 37)
    //val utente2 = PersonaConValidazione("", 50) -> IllegalArgumentException -> il nome non può essere vuoto
    //val utente3 = PersonaConValidazione("Silente", -100) IllegalArgumentException -> l'età non può essere negativa
    
    println("\n-----\n")
    println("\n---Getter e Setter personalizzati---\n")
    val temperatura = GetterSetterTemperatura()
    temperatura.celsius = 100.0
    //temperatura.celsius = -280.15 -> solleva un'eccezione
    println("Celsius: ${temperatura.celsius}°C")
    println("Fahrenheit: ${temperatura.fahrenheit}°F")
    
 
}