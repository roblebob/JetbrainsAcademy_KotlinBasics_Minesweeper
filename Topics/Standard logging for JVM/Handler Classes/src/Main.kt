import java.util.logging.*

fun main() = readln().split(' ').sumOf { Level.parse(it.uppercase()).intValue() }.let { println(it) }
