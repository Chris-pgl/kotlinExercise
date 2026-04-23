fun main() {
    println("\n-----------Any e Unit-----------\n")
    println("\n---Any---\n")
    /* Any può contenere qualsiasi tipo
    * */
    val qualcosa: Any = "questa è una stringa"
    val altroQualcosa: Any = 3
    println(qualcosa)
    println(altroQualcosa)
    
    println("\n---Unit---\n")
    /* Le funzioni senza return type restituiscono Unit
     * implicitamente.
     * Sostanzialmente è un ritorno vuoto
    * */
    fun saluta1(): Unit
    {
        println("Ciao")
    }
    
    fun saluta2(){
        println("Ciao") //Unit qui viene omesso
    }
    
    saluta1()
    saluta2()
    
}
