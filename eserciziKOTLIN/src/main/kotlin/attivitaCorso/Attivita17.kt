package attivitaCorso

data class Prodotto(val nome:String, val prezzo:Double, val categoria:String){
    init {
        println("Prodotto creato: $nome, $prezzo, $categoria")
    }
}

class GestoreCatalogo() {

    //filtra i prodotti maggiore di 800€
    fun ottieniProdottiPremium(prodotti: List<Prodotto>): List<Prodotto> {
        return prodotti.filter { it.prezzo > 800 }
    }

    //filtra i prodotti per nome in una maplist
    fun estraiNomi(prodotti: List<Prodotto>): List<String> {
        return prodotti.map { it.nome }
    }

    //Partition(fascia di prezzo)
    fun dividiPerPrezzo(prodotti: List<Prodotto>): Pair<List<Prodotto>, List<Prodotto>> {
        return prodotti.partition {it.prezzo < 100}
    }

    //Group by categoria
    fun raggruppaPerCategoria(prodotti: List<Prodotto>): Map<String,List<Prodotto>> {
        return prodotti.groupBy { it.categoria}
    }

    //Any, All
    fun controllaCatalogo(prodotti: List<Prodotto>) {
        val prezzoZero = prodotti.any { it.prezzo == 0.0 }
        println("Esiste un prodotto con prezzo 0€??: $prezzoZero")
        val prezzoPositivo = prodotti.all { it.prezzo > 0 }

        println("Tutti i prezzi sono positivi?: $prezzoPositivo")
    }
}

fun main() {
    val prodotti = listOf(
        Prodotto("Smartphone", 1000.0, "Elettrodomestici"),
        Prodotto("Tablet", 500.0, "Elettrodomestici"),
        Prodotto("Televisore", 800.0, "Elettrodomestici"),
        Prodotto("Notebook", 1200.0, "Elettrodomestici"),
        Prodotto("Console", 300.0, "Elettrodomestici"),
        Prodotto("Proiettore", 150.0, "Elettrodomestici"),
        Prodotto("Aspirapolvere in Regalo con un altro Prodotto", 0.0, "Elettrodomestici")
    )

    val catalogo = GestoreCatalogo()
    println("----- Prodotti Premium -----")
    val premium = catalogo.ottieniProdottiPremium(prodotti)
    println(premium)

    println("\n----- Nomi dei Prodotti -----")
    val nomi = catalogo.estraiNomi(prodotti)
    println(nomi)

    println("----- Divisione per Prezzo -----")
    val (economici, standard) = catalogo.dividiPerPrezzo(prodotti)
    println("Economici: $economici")
    println("Standard/Lusso: $standard")

    println("----- Raggruppati per Categoria -----")
    val gruppi = catalogo.raggruppaPerCategoria(prodotti)
    println(gruppi)

    println("----- Controllo Catalogo -----")
    catalogo.controllaCatalogo(prodotti)
}





