package nozionKotlin

fun main() {

    //varibili var e val
    //in genere si usa sempre val, ( final ) per evitare che una variabile cambia nel corso dell app
    val variabileImmutevole: String = "Immutevole"
    var variabileMutevole: String = "mutevole"


    //Kotlin ha dei operatori Safety, per evitare crash quando torna un dato null o inspettato
    var nameNotNull: String = ""// non può essere null
    var nameNull: String? = "" //Può essere nullo grazie a ?
    var name = "Luca"

    //Operatori chiave:
    //  ?. safe call
    // ?: elvis call safety)
    // !! significa " FIDATI non è null. anche se potrebbe esserlo. PERICOLOSO

    //kotlin capisce il tipo di variabile dal = quindi si può abbreviare la creazione.
    // es: val age:Int = 29 diventa:

    val age = 29
    //questa funzione è migliore rispèetto alla 2-
   fun getUserType(age: Int?): String {
       return when (age) {
             null -> "Unknown"
           in Int.MIN_VALUE..-1 -> "Non valido"
           in 0..17 -> "Minore"
           in 18..64 -> "Adulto"
           else -> "Senior"
       }
   }


    fun getUserType2(age: Int?): String {
        return age?.let {
            when {
                it < 0 -> "Non valido"
                it in 0..17 -> "Minore"
                it in 18..64 -> "Adulto"
                else -> "Senior"
            }
        } ?: "Unknown"
    }

    //extension function
    // funzione aggiuntiva di String. ( posso creare funzioni che String non ha)
    fun String.saluta(): String {
        return "Ciao $this";
    }



    println(name.saluta())

    println("quanti anni ha $name?: $age quindi è: ${getUserType(age)}")
    println(getUserType(null))
    println(getUserType(-1))   // Non valido
    println(getUserType(0))    // Minore
    println(getUserType(17))   // Minore
    println(getUserType(18))   // Adulto
    println(getUserType(64))   // Adulto
    println(getUserType(65))   //Senior

}