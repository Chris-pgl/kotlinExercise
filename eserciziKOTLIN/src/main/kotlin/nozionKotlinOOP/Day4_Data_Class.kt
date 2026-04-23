package nozionKotlin

fun main() {

    val p1 = Person(
        "Chris",
        "Pugli",
        29)
    val p2 = Person(
        "Luca",
        "Verdi",
        30
    )

    val listOfPeople = listOf<Person>(p1,p2)
    println("----- all people -----")
    listOfPeople.forEach { println(it) }
    println("----- all people age -----")
    listOfPeople.forEach { person -> println(person.age) }

}

/**
 * le data class sono classi semplici
 * contengono dati
 */
data class Person(val name:String, val lastname:String, val age:Int){



}