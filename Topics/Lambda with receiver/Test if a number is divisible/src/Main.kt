val isDivisible: Int.(Int) -> Boolean = {
    this % it == 0
}

/* Do not change code below */
fun main() {
    val (a, b) = readln().split(' ').map { it.toInt() }
    println(a.isDivisible(b))
}