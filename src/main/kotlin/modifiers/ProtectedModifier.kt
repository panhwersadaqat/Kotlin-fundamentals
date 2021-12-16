package modifiers

open class ProtectedModifierDemo {
    protected fun display() {
        println("Hello World from protected function")
    }
}

class ProtectedModifierDemoB : ProtectedModifierDemo() {
    fun getDisplayMethod() {
        display()
    }
}
fun main() {
    val obj = ProtectedModifierDemoB()
    obj.getDisplayMethod()
}