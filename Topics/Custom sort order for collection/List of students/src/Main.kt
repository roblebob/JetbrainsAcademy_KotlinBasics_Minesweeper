fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.sortedWith(compareBy({ it.lowercase() }, { it.lowercase() }))

    println(res)
}