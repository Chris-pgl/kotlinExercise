fun main() {
	println("----------Tipi Numerici interi------------")
    /* Kotlin ci fornisce 4 tipi per i numeri interi:
     * - byte (8 bit)
     * - Short (16 bit)
     * - Int (default, 32 bit)
     * - Long (64 bit ed è accompagnato dal suffisso L)
     * 
     * ATTENZIONE: non esistono conversioni implicite tra tipi numerici diversi
     * **/
     
     val piccino: Byte = 127 // 8 bit
     val piccolo: Short = 32000 // 16 bit
     val normale: Int = 42 // 32 bit
     val grande: Long = 9_000_000L // 64 bit, l'underscore si mette per una maggiore leggibilità
     val esadecimale = 0xFF // esadecimale (255)
     val binario = 0b1010 // binario (10)
    /* Double e float sono numeri con virgola mobile:
     * - float ha 32 bit
     * - double è quello più usato ed ha 64 bit
     * **/
     val double: Double = 3.14159 //decimale, default
     val float: Float = 2.71F // con suffisso F
    
     println(piccino)
     println(piccolo)
     println(normale)
     println(grande)
     println(esadecimale)
     println(binario)
     println(double)
     println(float)
     
     println("\n----------Conversioni numeriche Esplicite------------\n")
     /* In Kotlin le conversioni tra tipi numerici DEVONO essere sempre esplicite
      * usando metodi come toX(), X sta per : Long, Double, Byte etc etc....
      * **/
     val x: Int = 150
     //val y: Long = x // ERRORE:  type mismatch
     val y: Long = x.toLong() //quindi andremo a fare una conversione esplicita usando il metodo toX()
     val z: Double = x.toDouble()
     val b: Byte = x.toByte()
     
     println(x)
     println(y)
     println(z)
     println(b)
}