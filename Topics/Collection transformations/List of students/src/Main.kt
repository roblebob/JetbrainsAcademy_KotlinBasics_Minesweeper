fun main() {
    val list = readln().split(" ")
    // write your code here
    println(
        list.associateWith { it.length }.toList().joinToString(
            separator = ", ",
            limit = 2,
            truncated = "*"
        ) { "${it.first}->${it.second}" }
    )
}