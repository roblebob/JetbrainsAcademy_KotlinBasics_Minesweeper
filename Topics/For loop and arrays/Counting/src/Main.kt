fun main() {
    // write your code here
    val list = mutableListOf<Int>()
    val n = readln().toInt()
    repeat(n) {
        list.add(readln().toInt())
    }
    val m = readln().toInt()
    println(list.count { it == m })
}