package nozionKotlinOOP

fun main() {
    Repsitory.startFetch()
    getResult(result = Repsitory.getCurrentState())
    Repsitory.finishFetch()
    getResult(result = Repsitory.getCurrentState())
    Repsitory.error()
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
        else -> print("N/A")
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


}


/**
 * Enum - enumerated type
 * tramite gli enum possiamo gestire i vari stati
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

abstract class Result

data class Success(val dataFetch:String?): Result()
data class Error(val exception: Exception): Result()
object NotLoading: Result()
object Loading: Result()