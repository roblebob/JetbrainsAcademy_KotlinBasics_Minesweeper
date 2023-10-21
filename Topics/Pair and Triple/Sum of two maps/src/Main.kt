fun Pair<Int, Int>.add(other: Pair<Int, Int>): Pair<Int, Int> {
    return Pair(this.first + other.first, this.second + other.second)
}

fun sum(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Pair<Int, Int> {
    // write your code here
    return p1.add(p2)
}

/* Do not change code below */
fun main() {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    val (c, d) = readLine()!!.split(' ').map { it.toInt() }
    val pairOne = Pair(a, b)
    val pairTwo = Pair(c, d)
    println(sum(pairOne, pairTwo))
}

