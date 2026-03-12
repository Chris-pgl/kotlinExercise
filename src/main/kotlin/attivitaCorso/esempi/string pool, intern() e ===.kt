fun main() {
    val a = "ciao"
/*In Kotlin (come in Java), i literal string ("ciao") vengono inseriti nello STRING POOL.
* Lo String Pool è un'area speciale della JVM che conserva una sola copia delle stringhe letterali.
*Quindi "ciao" è un oggetto unico e condiviso.
**/

val b = "ci" + "ao"
/*Questa concatenazione è fatta a compile-time perché entrambe le parti sono literal.
*Il compilatore Kotlin (come quello Java) ottimizza e produce direttamente "ciao".
*Risultato: anche b punta allo stesso oggetto nel pool.
**/
println(a)
println(b)

val c = String(charArrayOf('c','i','a','o'))
/* Qui invece si crea una NUOVA stringa tramite costruttore.
*In Java sarebbe: new String(new char[]{'c','i','a','o'});
*Le stringhe create con new NON finiscono automaticamente nello String Pool.
*Quindi c è un oggetto diverso, anche se ha lo stesso contenuto.
**/
println(c)

println(a === b)
/* === in Kotlin confronta la *identità* (come == in Java).
*Risultato: TRUE, perché a e b puntano allo stesso oggetto del pool.
**/
println(a === c)
// Risultato: FALSE, perché c è un oggetto diverso, creato con new String().

val d = c.intern()
/*intern() chiede alla JVM di:
*- cercare nel pool una stringa con lo stesso contenuto
*- se esiste, restituirla
*- altrimenti inserirla nel pool
*Poiché "ciao" esiste già nel pool, d punterà allo stesso oggetto di a.
**/
println(a === d)
// Risultato: TRUE, perché ora d è la versione "pooled" della stringa.
}
