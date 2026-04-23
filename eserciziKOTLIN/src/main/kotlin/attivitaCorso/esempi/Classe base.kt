/* class Persona(val nome: String, val eta: Int)
 * **/
class Persona(val nome: String, val eta: Int){}
fun main() {
    println("\n---Classe base---\n")
    val bruclino = Persona("Bruclino", 38)
    val voldemort = Persona("Voldemort", 80)
    
    println(bruclino.nome)
    println(voldemort.eta)
}