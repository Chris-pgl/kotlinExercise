fun main() {
    println("\n-----------Tipi Nullable-----------\n")
    //Non-nullable: null non è mai ammesso
    val nome: String = "Padme"
    //nome = null -> Errore!
    println(nome)
    
    //Nullable: null è permesso, se dichiarato con "?"
    var cognome: String? = "Organa"
    cognome = null
    println(cognome)

}
