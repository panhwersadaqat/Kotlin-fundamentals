package scopeFuncExample

class InfoRunScope{
    lateinit var name: String
    lateinit var lname: String
}

fun main() {
    var info: InfoRunScope? = null

    info?.run {
        print(name)
    }

    info = InfoRunScope().apply {
        name = "Sadaqat"
        lname = "Panhwer"
    }

    info.run {
        print("$name $lname")
    }
}