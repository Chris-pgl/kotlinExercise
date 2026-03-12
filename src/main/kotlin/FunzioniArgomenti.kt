import com.sun.net.httpserver.Authenticator.Success

fun main(){

    /*
    kotlin ha una funzione per passare una funzione come Argomento di una funzione
     */

    calcoloMoltoComplesso(
        {println("Tutto OK")},
        {println("Error Kernel")}
    )

}

fun calcoloMoltoComplesso(success:()-> Unit, error:()->Unit){
    val risultato = false
    /* * */
    if (risultato)
        success()
    else
        error()
}