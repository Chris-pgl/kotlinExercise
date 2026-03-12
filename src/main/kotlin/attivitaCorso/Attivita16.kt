package attivitaCorso
data class Contatto(val nome: String, val eta: Int){
}

class RubricaManager(val contatto: List<Contatto>){
    //restituisce tutti i contatti con alemno 18Anni
    fun ottieniMaggiorenni(): List<Contatto>{
        return contatto.filter{it.eta >= 18}
    }
    //restituisce i nomi in Maiuscolo
    fun ottieniNomiMaiuscolo(): List<Contatto>{
        return contatto.map{it.copy(nome = it.nome.uppercase())}
    }

    //restituisce i contatti in minuscolo
    fun ottieniNomiMinuscolo(): List<Contatto>{
        return contatto.map{it.copy(nome = it.nome.lowercase())}
    }
    //restituisce il contatto per nome
    fun ottieniContattoPerNome(nome: String): Contatto? {
        return contatto.find{it.nome == nome}
    }
    //pulisce i nomi duplicati e torna un set
    fun pulisciNomiDuplicatiSet(nomigrezzi: List<Contatto>): Set<Contatto>{
        return nomigrezzi.toSet()
    }

}
fun main() {

    val contatti = listOf(
        Contatto("Mario", 25),
        Contatto("luca", 19),
        Contatto("Luca", 18),
        Contatto("Luca", 18),
        Contatto("Lucia", 21),
        Contatto("Giovanni", 17),
        Contatto("Aldo", 17),
        Contatto("Giacomino", 17))

    val rubrica = RubricaManager(contatti)
    println("============= RUBRICA ==============")


    println("Contatti Maggiorennini:")
    println(rubrica.ottieniMaggiorenni())
    println("============================================")

    println("Contatti in Maiuscolo")
    println(rubrica.ottieniNomiMaiuscolo())
    println("============================================")

    println("Contatti in minuscolo")
    println(rubrica.ottieniNomiMinuscolo())
    println("============================================")

    println("Contatti per nome: ")
    println("Luca: ${rubrica.ottieniContattoPerNome("Luca")}")
    println("============================================")

    println("Contatti duplicati:")
    println(rubrica.pulisciNomiDuplicatiSet(contatti))


}