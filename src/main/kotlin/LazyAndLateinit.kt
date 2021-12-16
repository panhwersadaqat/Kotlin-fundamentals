//lateinit variable
lateinit var latText: String

fun main() {
    latText = "Late Text print"
    //lazy variable
    val lazText: String by lazy {
        "Lazy text print"
    }

    println(latText)
    println(lazText)
}