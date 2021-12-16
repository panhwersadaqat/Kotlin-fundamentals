package scopeFuncExample

fun main() {

    var text: String? = null
    text?.let {
        print(it)
    }

    text = "Hello World"
    text?.let {
        println(it)
    }

}