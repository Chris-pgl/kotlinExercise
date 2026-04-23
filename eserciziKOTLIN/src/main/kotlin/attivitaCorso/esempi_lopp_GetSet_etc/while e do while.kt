fun main() {
    println("\n----WHILE E DO WHILE----\n")
    println("\n----WHILE----\n")
    /* Questo ciclo controlla la condizione PRIMA di eseguire
     * il codice. Se la condizione è falsa fin dall'inizio,
     * il blocco non verrà mai eseguito.
     * **/
     
     var contatore = 1 //qui usiamo var perché deve cambiare ad ogni giro
     while (contatore <= 10) {
         println("Giro numero $contatore")
         //Incremento: aumenta il valore di 1 a ogni giro
         contatore++ //contatore = contatore + 1
         
     }
   println()
   println("\n----DO-WHILE----\n")
   /* La sua caratteristica unica è che esegue il codice ALMENO una volta.
    * La condizione viene infatti controllata SOLO alla fine del blocco.
    * **/
    var tentativo = 0
    do {
        tentativo++
        println("Tentativo numero $tentativo")
    } while(tentativo < 10) //qui mettiamo il controllo, dopo l'esecuzione
    
     println("\n----Decremento----\n")
     var timer = 10
     println("Timer partito...")
     
     while (timer > 0) {
         if (timer > 1) {
             println("Mancano $timer secondi...")
         } else {
             println("Manca $timer secondo...")
         }
         
         timer-- //timer = timer - 1
     }
     println("Tempo scaduto!")
}