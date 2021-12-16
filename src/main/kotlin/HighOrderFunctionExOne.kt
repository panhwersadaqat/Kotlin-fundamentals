fun myHighOrderFunc(name: String, lname: String, fn: (String, String) -> String) {
    val result = fn(name,lname)
    print(result)
}

fun main() {
    val fn: (String, String) -> String = {
            name, lname -> "$name $lname"
        }
    myHighOrderFunc("Sadaqat","Panhwer", fn)
}