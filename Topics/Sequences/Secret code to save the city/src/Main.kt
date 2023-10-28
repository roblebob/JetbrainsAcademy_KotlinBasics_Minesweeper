fun main() {
    val list = readln().split(" ").asSequence()
    // write your code here
    println(list.filter { it.length > 5 }.map { it.reversed().uppercase() }.take(3).toList())
}