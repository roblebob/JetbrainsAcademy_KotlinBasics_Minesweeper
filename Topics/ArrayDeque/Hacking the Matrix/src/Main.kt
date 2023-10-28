fun main() {
    val list = readln().split(" ").map { it.toInt() }
    val deque = ArrayDeque<Int>(list)
    val newDeque = ArrayDeque<Int>()

    // write your code here
    for (i in deque.indices) {
        if (i % 2 == 0) {
            newDeque.add(deque.removeFirst())
        } else {
            newDeque.add(deque.removeLast())
        }
    }
    println(newDeque.joinToString(" "))
}