package minesweeper

import kotlin.random.Random

class GameField(private val n: Int, numMines: Int) {
    private val ground = MutableList(n) { MutableList(n) { false } }

    init {
        repeat(numMines) {
            while (true) {
                val x = Random.nextInt(0, n)
                val y = Random.nextInt(0, n)
                if (ground[x][y]) {
                    continue
                }
                ground[x][y] = true
                break
            }
        }
    }




    fun print() {
        for (i in 0 until n) {
            for (j in 0 until n) {
                print(if (ground[i][j]) "X" else {
                    val count = countMines(i, j)
                    if (count == 0) "." else count.toString()
                })
            }
            println()
        }
    }

    private fun countMines(i: Int, j: Int): Int {
        var count = 0

        for (x in i - 1 .. i + 1) {
            for (y in  j - 1 .. j + 1) {
                if (x in 0 until n && y in 0 until n && ground[x][y] ) {
                    count++
                }
            }
        }
        return count
    }
}



fun main() {
    print("How many mines do you want on the field? ")
    val numMines = readln().toInt()
    val gameField = GameField(9, numMines)
    gameField.print()
}
