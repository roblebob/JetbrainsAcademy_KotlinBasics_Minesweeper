fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.sortedBy { it.length }.reversed()

    println(res)
}