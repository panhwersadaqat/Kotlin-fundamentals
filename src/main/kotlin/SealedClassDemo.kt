sealed class SealedClass {
    object A : SealedClass() {
        fun showFName() {
            println("Sadaqat")
        }
    }

    object B : SealedClass() {
        fun showLName() {
            println("Panhwer")
        }
    }
}

fun main() {
    val objA = SealedClass.A
    objA.showFName()

    val objB = SealedClass.B
    objB.showLName()
}