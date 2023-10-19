fun main() {
    // Write your code here
    val list = readln().split(" ").map { it.toInt() }
    val n = readln().toInt()
    println(list.getOrNull(n))
}