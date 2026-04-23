package esercitazioniClassEtc

fun main(){

    //lista non mutabile come un array base
    val lista = listOf("cane","gatto","coccodrillo")
    println(lista.size)
    println(lista[0]) // o lista.get(0)
    println(lista.indexOf("coccodrillo")) // mi dice la posizione di quella stringa nella lista


    //lista mutabile come un arrayList

    val listaMutabile = mutableListOf<Int>()
    listaMutabile.add(2)
    listaMutabile.add(0,1)
    listaMutabile.add(3)
    listaMutabile.add(4)
    listaMutabile.remove(3)
    println(listaMutabile)

    lista.forEach {
        println(it)
    }

    listaMutabile.forEach {
        println(it)
    }

    //possiamo anche trasformare una lista in una mutableList
    lista.toMutableList()
    //e posssiamo tornare alla lista non mutable
    lista.toList()
}
