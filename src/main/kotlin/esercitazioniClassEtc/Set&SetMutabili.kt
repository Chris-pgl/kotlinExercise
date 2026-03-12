package esercitazioniClassEtc
fun main(){

    val set = setOf<String>("cane","gatto","coccodrillo")
    println(set.size)
    println(set.indexOf("gatto"))
    println(set.contains("coccodrillo"))
    val anotherset = setOf<String>("gatto","cane","coccodrillo")
    println(set == anotherset)



    val setMutable = mutableSetOf(1,2,3,4)

    setMutable.add(33)
    setMutable.remove(2)
    println(setMutable)


}