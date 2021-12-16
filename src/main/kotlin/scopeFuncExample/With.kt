package scopeFuncExample

class InfoWithScope {
    lateinit var name: String
    lateinit var lname: String
}
fun main() {

    val obj = InfoWithScope().apply {
        name = "Sadaqat"
        lname = "Panhwer"
    }

    with(obj){
        print("$name $lname")
    }
}