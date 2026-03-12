import kotlin.random.Random

fun main(args: Array<String>) {


    /*
    TRACCIA: il calcolatore deve generare random numeri compreso tra 0 e 100
    il giocatore ha 10 tentativi per indovinare il numero
    ad ogni turno del giocatore, il calcolatore può fornire tre risultati:
    1) se il giocatore indovina il numero restituisce " BRAVO, HAI VINTO"
    2) se il giocagtore inserisce un numero più alto restituisce "Più alto del mio numero!"
    3) se il gioocatore inserisce un numero più basso restituisce "Più bassp del mio numero!"
     */

    val numero = Random.nextInt(100) // genera num casuale fino a 100
  // risposta = readLine()!!.toInt() // prende un numero intero da tastiera
    var risposta : Int
    var tentativi = 10
    var vittoria = false

    println("Benvenut* alla roulette! Trova il mio numero!")
    do{
        print("Tentativi rimasti: $tentativi, inserisci il tuo numero:\t")
        risposta = readLine()!!.toInt()
        when{
            numero == risposta -> {println("Bravo hai vinto!")}
            numero>risposta -> {println("Più basso del mio numero! Ritenta!")}
            numero<risposta -> {println("Più alto del mio numero! Ritenta!")}
        }
        tentativi --
    }while (tentativi >= 1 && !vittoria)
   if (!vittoria)
       println("Tentativi finiti! Hai perso!")
}