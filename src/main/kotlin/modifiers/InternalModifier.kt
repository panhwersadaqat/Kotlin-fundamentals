package modifiers

internal class InternalModifierDemo {
    fun display() {
        println("Hello World")
    }
}

fun main() {
    val obj = InternalModifierDemo()
    obj.display()
}