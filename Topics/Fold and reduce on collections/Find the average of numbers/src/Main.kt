fun main() {
    val list = readln().split(" ").map { it.toDouble() }
    // write your code here
    val res = list.reduce { acc, d -> acc + d } / list.size


    println(res)
}