fun main() {
    println("\n-----------Array e Range-----------\n")
	/* - Array = sequenza di valori dello stesso tipo, con dimensione fissa.
	 * Si accede agli elementi tramite indice, che parte da 0
	 * - Range = è una sequenza di valori compresi tra un minimo e un massimo.
	 * Si crea con l'operatore ". .", è molto utilizzato con i loop
	**/
    println("\n-----------Array-----------\n")
	//Array di stringhe
    val nomi = arrayOf("Bruclino","Mirtilla Malcontenta","Padme")
    println(nomi[1]) //mirtilla Malcontenta
    println(nomi.size) //con .size mi restituirà il numero degli elementi all'interno della lista
    
    //Array di interi
    val numeri = intArrayOf(72, 15, 30, 92, 27, 10)
    println(numeri[4])
    
    println("\n-----------Range-----------\n")
    
    /*Range: sequenza da .. a
     * l'operatore .. include entrambi gli estremi**/
    val range1 = 1 .. 10 //da 1 a 10 incluso
    /*Range con until
     * l'operatore until mi escluderà l'ultimo numero
     * della sequenza**/
    val range2 = 1 until 100
    /* Range decrescente con downTo
     * **/
    println("\n---Range decrescente---\n")
    val range3 = 10 downTo 1
    for (i in range3) {
        println(i)
    }
    /* Range con incremento personalizzato con step
     * **/
     println("\n---Range con incremento personalizzato---\n")
    val range4 = 1..10 step 2
    for (i in range4) {
        println(i)
    }
    println("\n------\n")
    //Verifichiamo se un valore si trova all'interno del range
    println(5 in 1..10)
    println(15 in 1..10)
    println(range1)
    println(range2)
    println(range3)
    println(range4)
}
