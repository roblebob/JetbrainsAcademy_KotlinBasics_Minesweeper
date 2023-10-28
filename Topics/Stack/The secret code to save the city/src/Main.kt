import java.util.Stack

fun main() {
    val list = readln().split(" ")
    val res = mutableListOf<String>()

    // write your code here
    val stack = Stack<String>().also { it.addAll(list) }
    while (stack.isNotEmpty()) { res.add(stack.pop()) }

    println(res)
}