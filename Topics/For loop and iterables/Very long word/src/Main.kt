fun findLongestByIterator(strIterator: Iterator<String>): String {
    if (!strIterator.hasNext()) return ""
    var longest = strIterator.next()
    while (strIterator.hasNext()) {
        with(strIterator.next()) {
            if (this.length > longest.length) { longest = this }
        }
    }
    return longest
}

fun main() {
    val words: List<String> = readLine()!!.split("\\s+".toRegex())
    println(findLongestByIterator(words.iterator()))
}