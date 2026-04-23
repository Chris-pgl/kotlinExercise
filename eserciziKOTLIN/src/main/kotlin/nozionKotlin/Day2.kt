package nozionKotlin

fun main() {
    println("------------------ default Car class ----------------------")
    val carDefault = Car()
    carDefault.drive()


    println("------------------ 1 Car  ----------------------")
    val car = Car()
    car.color = "Blue"
    car.model = "car1 BMW"
    car.drive()
    car.speed(100,190)

    println("------------------ 2 Car  ----------------------")
    val car2 = Car(model = "car2 Alfa", color = "Orange")
    car2.drive()
    car2.speed(110,200)


    println("------------------ extend class Car to Truck  ----------------------")
    //Truck
    val truck = Truck()
    truck.model = "Fiat"
    truck.color = "White"
    truck.speed(70,100)
    truck.drive()


}

/**
 * Con l'attributo open, significa che questa classe può essere estesa (ereditarietà)
 * l'attrivuto Any ( è inutile al 98%) le classi kotlin estendono già Any
 * open va usato anche nei metodi che vogliamo portarci per override
 */
open class Car{
    /**
     * Con il costruttore istanziato così, posso passare quelli di default o impostarli
     */
    constructor(model: String?=null, color: String?=null) {
        this.model = model ?: this.model
        this.color = color ?: this.color
    }


    /**
     * parametri default
     */
    var color: String = ""
    var model: String = ""

    open fun drive(){
        println("The car model: $model with color $color are driving...vroommm")
    }

    open fun speed(minSpeed:Int, maxSpeed:Int){
        println("Min speed is $minSpeed and MaxSpeed is $maxSpeed")
    }
}

/**
 * Estendo Car
 */
class Truck(model: String? = null, color: String? = null): Car(model, color){
     override fun speed(minSpeed: Int, maxSpeed: Int){
         println("Min speed is $minSpeed and MaxSpeed is $maxSpeed")
    }

    override fun drive() {
        println("Vrooom..like a truck!!")
    }
}



