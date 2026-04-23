package nozionKotlin

fun main() {

    println("Hello chris".appeendNewDev(" new developer!"))
    println("this is funn".removeFirstAndLastChars())

}

/**
 * Possiamo creare nuove funzioni di classi già esistenti alloccorenza
 * si chiama Extension Function
 * La classe String, non ha il metodo appendNewDev()
 * in questo modo possiamo creare le nostre nuove funzioni che ci servono
 */
fun String.appeendNewDev(toApped:String):String = this.plus(toApped)

fun String.removeFirstAndLastChars():String{
    return this.substring(1,this.length - 1)
}
