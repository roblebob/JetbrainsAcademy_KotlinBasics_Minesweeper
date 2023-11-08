package minesweeper

import kotlin.random.Random

const val N = 9

class GameField(val n: Int, numMines: Int) {

    private val ground = Ground()

    inner class Ground {
        val mines = MutableList(n) { MutableList(n) { false } }
        val marked = MutableList(n) { MutableList(n) { false } }
        val numbers = MutableList(n) { MutableList(n) { 0 } }
    }

    init {
        // set mines
        repeat(numMines) {
            while (true) {
                val x = Random.nextInt(0, n)
                val y = Random.nextInt(0, n)
                if (ground.mines[x][y]) { continue }
                ground.mines[x][y] = true
                break
            }
        }

        // count numbers
        for (i in 0 until n) {
            for (j in 0 until n) {
                ground.numbers[i][j] = if (!ground.mines[i][j]) countMines(i, j) else 0
            }
        }
    }


    fun print() {
        // print header
        println()
        println(" │${(1 .. n).joinToString("")}|")
        println("—│${"—".repeat(n)}|")

        // print body
        for (i in 0 until n) {
            print("${i + 1}│")

            for (j in 0 until n) {
                print(
                    when {
                        ground.marked[i][j] -> "*"
                        ground.numbers[i][j] > 0 -> ground.numbers[i][j].toString()
                        else -> "."
                    }
                )
            }

            println("|")
        }

        // print footer
        println("—│${"—".repeat(n)}|")
    }


    private fun countMines(i: Int, j: Int): Int {
        var count = 0

        for (x in i - 1 .. i + 1) {
            for (y in  j - 1 .. j + 1) {
                if (x in 0 until n && y in 0 until n && ground.mines[x][y] ) {
                    count++
                }
            }
        }
        return count
    }


    fun setMark(x: Int, y: Int): Boolean {
        if (ground.numbers[x][y] > 0) { return false }
        ground.marked[x][y] = !ground.marked[x][y]
        return true
    }

    fun isWin(): Boolean = ground.mines == ground.marked
}



fun main() {
    print("How many mines do you want on the field? ")
    val numMines = readln().toInt()
    val gameField = GameField(N, numMines)
    gameField.print()

    while (true) {
        print("Set/delete mine marks (x and y coordinates): ")
        val (y, x) = readln().split(" ").map { it.toInt() - 1}
        if (!gameField.setMark(x, y)) {
            println("There is a number here!")
            continue
        }
        if (gameField.isWin()) { break }

        gameField.print()
    }

    println("Congratulations! You found all the mines!")
}
