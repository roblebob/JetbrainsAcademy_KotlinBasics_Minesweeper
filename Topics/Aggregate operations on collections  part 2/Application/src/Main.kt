data class Ship(val name: String, val ammunition: Int)

fun main() {
    val ships = readln().split(" ")
    val shipsList = ships.map { Ship(it.split("-")[0], it.split("-")[1].toInt()) }

    // write your code here
    val res = with(shipsList) {
        "%d:%d:%.1f".format(
            this.distinctBy { it.ammunition }.count(),
            this.sumOf { it.ammunition },
            this.map { it.ammunition }.average()
        )
    }

    println(res)
}