package scopeFuncExample

class InfoWithoutScope {
    lateinit var name: String
    lateinit var lname: String
}
fun main() {
    val obj = InfoWithoutScope()
    obj.name = "Sadaqat"
    obj.lname = "Panhwer"

    print("${obj.name} ${obj.lname}")
}