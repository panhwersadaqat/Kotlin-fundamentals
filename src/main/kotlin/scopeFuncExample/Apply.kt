package scopeFuncExample

class InfoApplyScope{
    lateinit var name: String
    lateinit var lname: String
}

fun main() {
    InfoApplyScope().apply {
        name = "Sadaqat"
        lname = "Panhwer"
        print("$name $lname")
    }
}