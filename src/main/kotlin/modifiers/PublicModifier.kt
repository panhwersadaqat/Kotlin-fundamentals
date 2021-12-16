package modifiers

class PublicModifier {
    var number = 10
}

public class publicDemoClass {
    fun display(){
        println("Hello World from public class")
    }
}

fun main() {
    //Object of class without public keyword
    val objOne = PublicModifier()
    objOne.number = 5
    println("Updated value of number: ${objOne.number}")

    //Object of class with public keyword
    val objTwo = publicDemoClass()
    objTwo.display()
}