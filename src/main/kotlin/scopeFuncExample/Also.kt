package scopeFuncExample

fun main() {
    val list = mutableListOf("Hello", "World")
    list.also {
        it.add("from 'also' scope")
    }
    print(list)
}