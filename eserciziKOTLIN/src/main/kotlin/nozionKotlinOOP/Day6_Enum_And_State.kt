package nozionKotlinOOP

fun main() {
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())

}

fun getResult(result: Result){
    return when(result){
        Result.SUCCESS -> println("Success!")
        Result.FAILURE -> println("Failure..")
        Result.ERROR -> println("Error!")
        Result.IDLE -> println("Idle")
        Result.LOADING -> println("Loading..")
    }
}

/**
 * Questa è un singleton
 * ci sarà sempre una istanza.
 * stiamo fingendo che sia una classe che comunica con un server
 * e ci aspettiamo determinate risposte
 */
object Repository{
    private var loadState: Result = Result.IDLE
    private var dataFetched: String? = null

    fun startFetch(){
        loadState = Result.LOADING
        dataFetched = "data"
    }

    fun finishFetch(){
        loadState = Result.SUCCESS
        dataFetched = null
    }

    fun error(){
        loadState = Result.ERROR
    }

    fun getCurrentState(): Result{
        return loadState
    }


}


/**
 * Enum - enumerated type
 * tramite gli enum possiamo gestire i vari stati
 */
enum class Result{
    SUCCESS,
    FAILURE,
    ERROR,
    IDLE,
    LOADING
}