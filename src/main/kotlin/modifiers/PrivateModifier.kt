package modifiers

private class PrivateModifierDemo {
     fun display() {
        println("Hello World from private class")
    }
}

fun main() {
    val obj = PrivateModifierDemo()
    obj.display()
}