fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    while (true) {
        val name = readln()
        if (name == "stop") {
            break
        }
        val score = readln().toInt()
        if (!studentsMarks.contains(name)) {
            studentsMarks += name to score
        }
    }
    println(studentsMarks)
}