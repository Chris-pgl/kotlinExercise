class GetterSetterTemperatura(){
    /* In Kotlin getter e setter sono automatici. 
     * Possiamo personalizzarli per aggiungere logica.
     * Sintassi:
     * var eta: Int = 0
     * get() = field -> è la keyword per accedere al valore reale senza ricorsione infinita
     * set(valore) {
     * 		if (valore >= 0) field = valore
     * 	}
     * ----
     * var nome: String =""
     * 	set(valore){
     * 		field = valore.trim()-> rimuove gli spazi bianchi all'inizio e alla 
     * 	}
     * **/
    
    //Proprietà con setter che valida il valore
    var celsius: Double = 0.0
    set(value) {
        require(value >= -273.15) {
            "Sotto lo zero assoluto!"
        }
        field=value //"field" è il valore effettivo memorizzato
    }
    
    //Proprietà calcolata senza backing field, quindi non memorizza nulla
    val fahrenheit: Double
    get() = celsius * 9.0 / 5.0 + 32
}
fun main() {
    println("\n-----\n")
    println("\n---Getter e Setter personalizzati---\n")
    val temperatura = GetterSetterTemperatura()
    temperatura.celsius = 100.0
    //temperatura.celsius = -280.15 -> solleva un'eccezione
    println("Celsius: ${temperatura.celsius}°C")
    println("Fahrenheit: ${temperatura.fahrenheit}°F")
    
 
}