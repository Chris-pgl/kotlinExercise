package nozionKotlinOOP

fun main() {

    val listOfName = listOf("Chris","Ballerin","Tano","Peppe","Ture")
    val finderS = Finder(listOfName)
    //finder.findItemString(element = "Chris"){
    finderS.finderItem("Chris"){
        println("Found $it")
    }

    val listOfNumber = listOf(1,23,44,66,43,12,29,37)
    val finderI = Finder(listOfNumber)
    finderI.finderItem(29){
        println("Found $it")
    }

    val p1 = Person(
        "Chris",
        "Pugli",
        29)
    val p2 = Person(
        "Luca",
        "Verdi",
        30
    )
    val listOfPeople = listOf(p2,p1)
    val finderPeople = Finder(listOfPeople)
    finderPeople.finderItem(p1){
        println("Found $it")
    }

}

/**
class Finder(private val list: List<String>){

     * Possiamo aggiungere elvis '?' per dire che è nullable
     * Unit sta per Void, cioè che non torna nulla
     * questo: foundItem: (element: String?) -> Unit
     * significa che può essere accessibile come una lambda
     * Questa funzione va bene se si usa solo String, ma se vogliamo cercare altro,
     * dovremmo creare codice duplicati etc..
     * Ma possiamo usare i Generics Type!

    fun findItemString(element: String, foundItem: (element: String?) -> Unit){
        val itemFoundList = list.filter {
            it == element
        }
        if(itemFoundList.isEmpty()) foundItem(null)else
            foundItem(itemFoundList.first())
    }
    *       Usando i Generics risolviamo il problema
    */
class Finder<T>(private val list: List<T>){
    fun finderItem(element: T, foundItem: (element: T?) -> Unit){
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isEmpty()) foundItem(null) else
            foundItem(itemFoundList.first())

    }




}