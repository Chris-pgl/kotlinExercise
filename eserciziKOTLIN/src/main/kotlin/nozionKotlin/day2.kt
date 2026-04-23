package nozionKotlin

fun main() {

    val car = Car()
    car.color = "Blue"
    car.model = "car1 BMW"
    car.drive()

    val car2 = Car(model = "car2 Alfa", color = "Orange")
    car2.drive()

    val carDefault = Car()
    carDefault.drive()
}

class Car{
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

    fun drive(){
        println("The car model: $model with color $color are driving...vroommm")
    }
}
