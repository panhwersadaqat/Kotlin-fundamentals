fun nameFunc(name: String) {
    println("Hello $name")
}
fun myHighOrderFunc(funcName: (name:String) -> Unit, name: String) {
    funcName(name)
}
fun main() {
    myHighOrderFunc(::nameFunc, "Sadaqat Panhwer")
}