fun main() {
    println("\n----WHEN----\n")
    
    println("\n----WHEN come statement----\n")
    /* In questo caso il costrutto agisce come un comando.
     * Viene eseguito il blocco di codice corrispondente
     * al valore della variabile, MA non viene restituito
     * alcun valore.
     * **/
     
     val voto = 8
		
    	when (voto) {
            10   -> println("Eccellente")
            9    -> println("Ottimo")
            8    -> println("Distinto")
            7    -> println("Buono")
            6    -> println("Sufficiente")
            else -> println("Insufficiente")
        }
   
    println("\n----WHEN come espressione----\n")
    /* Qui il risultato del "when" viene assegnato alla variabile "giudizio".
     * In questa modalità, il ramo else è obbligatorio perché
     * il compilatore deve garantire che "giudizio" riceva
     * SEMPRE un valore.
     * **/
    
    val giudizio = when (voto) {
        10 -> "Eccellente"
        9 -> "Ottimo"
        8 -> "Distinto"
        7 -> "Buono"
        6 -> "Sufficiente"
        else -> "Insufficiente"
    }
    println("Giudizio finale: $giudizio, il tuo voto è $voto")
    
     println("\n----WHEN con range----\n")
     /* L'operatore "in" ci permette di verficare se il valore
      * appartiene a un intervallo numerico definito.
      * Questa è una soluzione molto efficiente per gestire 
      * raggruppamenti di dati.
      * */
      val fascia = when (voto) {
          in 8..10 -> "Alta" //"in 9..10" = "se voto è compreso tra 9 e 10 inclusi"
          in 7..6 -> "Media"
          in 5..3 -> "Bassa"
          else -> "Non valido"
      }
      
      println("Rientri nella fascia di valutazione $fascia, poiché il tuo voto è $voto")
     
}