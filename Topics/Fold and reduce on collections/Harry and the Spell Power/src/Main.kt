data class Spell(val name: String, val power: Int)


fun main() {
    val input = readln().split(" ")
    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }

    // write your code here
    val res = spells.map { it.power }.filter { it > 40 }.reduce { acc, i -> acc + i }

    println(res)
}