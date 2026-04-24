package nozionKotlinOOP

import java.io.IOException

fun main() {
    Repsitory.startFetch()
    getResult(result = Repsitory.getCurrentState())
    Repsitory.finishFetch()
    getResult(result = Repsitory.getCurrentState())
    Repsitory.error()
    getResult(result = Repsitory.getCurrentState())

    Repsitory.customFaiulure()
    getResult(result = Repsitory.getCurrentState())
    Repsitory.anotherCustomFaiulure()
    getResult(result = Repsitory.getCurrentState())

}

fun getResult(result: Result){
    return when(result){
        is Error -> {
            println(result.exception.toString())
        }
        is Success ->{
            println(result.dataFetch?: "Ensure you start the fetch first")
        }
        is Loading -> {
            println("Loading...")
        }
        is NotLoading ->{
            println("Idle")
        }

        is Faiulure.AnotherCustomFailure -> {
            println(result.anotherCustomFailure.toString())
        }
        is Faiulure.CustomFailure -> {
            println(result.customFailure.toString())
        }
    }
}

/**
 * Questa è un singleton
 * ci sarà sempre una istanza.
 * stiamo fingendo che sia una classe che comunica con un server
 * e ci aspettiamo determinate risposte
 */
object Repsitory{
    private var loadState: Result = NotLoading
    private var dataFetched: String? = null

    fun startFetch(){
        loadState = Loading
        dataFetched = "data"
    }

    /**
     *  dataFetch è un concetto molto importante da capire, specialmente se abbiamo applicazioni
     *  che necessitano di questo sistema per poter disporre di dati.
     *  in modo da sapere quali dati stiamo ricevendo e possiamo lavore con quei dati
     */
    fun finishFetch(){
        loadState = Success(dataFetched)
        dataFetched = null
    }

    fun error(){
        loadState = Error(exception = Exception("Exception Error"))
    }

    fun getCurrentState(): Result{
        return loadState
    }

    fun anotherCustomFaiulure(){
        loadState = Faiulure.AnotherCustomFailure(anotherCustomFailure = NullPointerException("//AnotherCustomFaiulr - Something went wrong"))
    }

    fun customFaiulure(){
        loadState = Faiulure.CustomFailure(customFailure = IOException("Custom Failure.."))
    }


}


/**
 * Enum - enumerated type
 * tramite gli enum possiamo gestire i vari stati
 * ma non possiamo ritornarci i dati per lavorarli
 */
//enum class Result{
//    //vorremo passare dati in piu come SUCCESS(val data:String) ma per farlo ci serve una classe astratta
//    SUCCESS,
//    ERROR,
//    IDLE,
//    LOADING
//}

/**
 * Una classe astratta è un concetto
 * es: Un triangolo è una forma
 *      ma una fomra non è solo un trinagolo.
 *      può essere un cerchio, un quadrato etc
 */
//abstract class Result
/**
 * Cos'è una sealed class?
 * è una classe astratta con una gerarchia limitata.
 * le classi che ereditano la sealed, devono essere nello stesso file.
 * tramite questa possiamo gestire meglio i casi.
 * es: nella fun getResult() non abbiamo più bisogno di un else.
 */
sealed class Result
//Abbiamo creato altre classi data e object per arginare il problema delle Enum, per poter ricevere meglio i dati
data class Success(val dataFetch:String?): Result()
data class Error(val exception: Exception): Result()
object NotLoading: Result()
object Loading: Result()

// Le sealed class posso annidare varie altri classi al suo interno.
sealed class Faiulure: Result(){
    data class CustomFailure(val customFailure: IOException): Faiulure()
    data class AnotherCustomFailure(val anotherCustomFailure: NullPointerException): Faiulure()
}

