package nozionKotlin

fun main() {

    val button = Button("Button")
    button.onClick("This is a Button")

    val superMarion = Character("Super Mario")
    superMarion.onClick("this is an character")

}

class Button(val label: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and there's a message: $message")
    }
}

class Character(val name:String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and message: $message")
    }
}

interface ClickEvent{
    fun onClick(message:String)
}