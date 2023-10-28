import java.util.*

fun main() {
    val list = readln().split(" ").map { it.toDouble() }
    // write your code here
    val stack = Stack<Double>()
    while (stack.size < list.size) {
        stack.push(list[list.size - 1 - stack.size])
    }
    println(stack.joinToString(" "))
}