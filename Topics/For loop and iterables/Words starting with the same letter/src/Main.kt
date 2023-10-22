fun main() {
    val words: List<String> = readln().split(" ")
    // output the result collection
    words.filter { words[0].first() == it.first() }.let { if (it.size == words.size) println(it.joinToString(" ")) }
}