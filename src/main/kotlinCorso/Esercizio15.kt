 interface Smartphone{
    fun takePhoto(){
        println("Scatto lo smartphone")
    }
}


 interface Camera{
    fun takePhoto(){
        println("Scatto con fotocamera")
    }
}

 class Iphone: SmartPhone(), Camera{
    override fun takePhoto(){
        super<Camera>.takePhoto()
        super<SmartPhone>.takePhoto()
    }
}

 //ese2---------------
 class Car{
     var brand = ""
     var model = ""
     init {
         println("Creata nuova auto: $brand $model")
     }
 }

 fun main() {
     //ese1------
     val iphone = Iphone()
     iphone.takePhoto()

     //ese2------
     val car = Car().apply{
         brand = "Ford"
         model = "Mustang"
     }
 }



