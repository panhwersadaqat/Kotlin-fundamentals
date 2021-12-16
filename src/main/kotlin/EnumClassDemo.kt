enum class DAYS {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

fun main() {
    for (day in DAYS.values()) {
        println("${day.ordinal} ${day.name}")
    }
}
