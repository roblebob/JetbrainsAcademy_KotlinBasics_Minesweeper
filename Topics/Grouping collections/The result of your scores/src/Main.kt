const val MINIMUM_MARK = 5
fun main() {
    val list = readln().split(" ").map { it.toDouble() }

    // write your code here
    val res = list
        .groupingBy { if (it >= MINIMUM_MARK) "pass" else "fail" }
        .eachCount()

    println(res)
}