fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list
        .groupingBy(keySelector = { it.first() })
        .reduce { _, accumulator, element -> if (accumulator.length >= element.length) accumulator else element }

    println(res)
}