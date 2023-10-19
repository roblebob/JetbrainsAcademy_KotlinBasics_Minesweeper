fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.filterIndexed { index, _ -> index % 2 == 0 }.map { it.length }.reduce(Int::plus)


    println(res)
}