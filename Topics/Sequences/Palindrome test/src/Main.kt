fun main() {
    val input = readln().split(" ").asSequence()
    // write your code here
    println(input.filter { it == it.reversed() }.count())
}