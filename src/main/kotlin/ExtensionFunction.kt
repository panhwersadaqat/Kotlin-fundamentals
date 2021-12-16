class Student {
    fun isPassed(marks: Int): Boolean {
        return marks>=60
    }
}
fun Student.isGradeA(marks: Int): Boolean {
    return marks>=80
}

fun main() {
    val obj = Student()
    val passingStatus = obj.isPassed(75)
    println("Passing status: $passingStatus")
    val gradeStatus = obj.isGradeA(75)
    println("Grade 'A' Status: $gradeStatus")
}