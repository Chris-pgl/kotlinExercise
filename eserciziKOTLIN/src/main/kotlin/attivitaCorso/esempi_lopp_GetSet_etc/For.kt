fun main() {
    println("\n----FOR----\n")
    println("\n----FOR con range----\n")
    println("\n---Range inclusivo---\n")
    /* Loperatore ".." crea un intervallo che include sia l'inizio
     * che la fine. Questo è il modo più semplice per contare
     * da un numero all'altro.
     * **/
    for (i in 1..5) { //"per ogni valore i che da 1 a 5"
       // println(i) -> i numeri vengono stampati uno sotto l'altro
        print("$i ") // -> i numeri verranno stampati sulla stessa linea
    }
    println()
    println("\n---Range esclusivo---\n")
    /*"1 until 5" -> nella stampa mi escluderà il 5
     * **/
     for (i in 1 until 100){
         //print("ID utente n.$i ")
         println("ID utente n.$i ")
     }
     //println()
    
	 println("\n---Range decrescente---\n")
    /* val range3 = 10 downTo 1
    for (i in range3) {
        println(i)
    }
     * **/
     for (i in 10 downTo 1) {
         print("$i ")
     }
     
     println()
    
     println("\n---Range con incremento personalizzato---\n")
     /* Range con incremento personalizzato con step
     * **/
     /* Di default, il ciclo incrementa di 1.
      * Con "step" possiamo decidere di quanto saltare a
      * ogni iterazione.
      * **/
    //val range4 = 1..10 step 2
    //for (i in range4) {
        //println(i)
    //}
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println() //println vuoto serve per accedere alla riga successiva
    
    //println(range3)
    //println(range4)


     
}