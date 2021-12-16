//Before singleton
class WithoutSingletonDemo
//After singleton
object SingletonDemo

fun main() {
    //Object without singleton class
    val objOne = WithoutSingletonDemo()
    val objTwo = WithoutSingletonDemo()
    println("First object without Singleton $objOne")
    println("Second object without Singleton $objTwo")

    println("---------------##-----------------")
    //with singleton class
    println("First object with Singleton ${SingletonDemo}")
    println("Second object with Singleton ${SingletonDemo}")
}