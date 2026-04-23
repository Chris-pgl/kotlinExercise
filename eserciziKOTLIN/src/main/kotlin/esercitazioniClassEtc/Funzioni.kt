package esercitazioniClassEtc

fun main(){

    println(2+3)
    println(somma(2,3))
    println(sottrazione(10,2))
    println(moltiplicazione(5,2))
    println(division(10,2))
    saluta("Chris",28)
    saluta2("Chris")

}
/* Sintassi della logica
dichiariamo che prendiamo due parametri di tipo Integer a suo interno
e vogliomo un dato di tipo Integer come risultato.
in seguito dico come svolgere la funzione

fun esercitazioniClassEtc.somma( x:Int, y:Int):Int{
    println("Sto sommando $x con $y..")
    return x+y
}
 */
//fatta in breve
fun somma(x:Int, y:Int):Int = x+y
fun sottrazione(x: Int, y: Int):Int = x-y
fun moltiplicazione(x: Int, y: Int):Int = x*y
fun division(x: Int, y: Int):Int = x/y

//Tipi di argomenti passati alle funzioni
fun saluta(nome:String, anni:Int) = println("Ciao $nome, hai $anni anni!")

//possiamoa nche passare un default argomento, in modo che se lasciato vuoto ha già il suo
fun saluta2(nome:String, anni:Int = 18) = println("Ciao $nome, hai $anni anni!")