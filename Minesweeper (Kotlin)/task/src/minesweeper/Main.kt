package minesweeper

import kotlin.random.Random

const val N = 9
const val IS_UNEXPLORED = -1

class GameField(val n: Int, val numMinesToBeSet: Int) {

    private val ground = Ground()
    private var numMines = 0

    inner class Ground {
        val mines = MutableList(n) { MutableList(n) { false } }
        val marked = MutableList(n) { MutableList(n) { false } }
        val explored = MutableList(n) { MutableList(n) { IS_UNEXPLORED } }
    }

    private fun setMines(numMines: Int, xNot: Int, yNot: Int) {
        // set mines
        repeat(numMines) {
            while (true) {
                val x = Random.nextInt(0, n)
                val y = Random.nextInt(0, n)
                if (ground.mines[x][y] || (xNot == x && yNot == y)) { continue }
                ground.mines[x][y] = true
                break
            }
        }
        this.numMines = numMines
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
                        ground.marked[i][j] && ground.explored[i][j] == IS_UNEXPLORED  -> "*"
                        ground.explored[i][j] == IS_UNEXPLORED -> "."
                        ground.explored[i][j] == 0 -> "/"
                        ground.explored[i][j] > 0  -> ground.explored[i][j].toString()
                        ground.mines[i][j] -> "X"
                        else -> "E"
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
                if (x in 0 until n && y in 0 until n && ground.mines[x][y]) {
                    count++
                }
            }
        }
        return count
    }


    fun mark(x: Int, y: Int): Boolean {
        if (ground.explored[x][y] > 0) { return false }
        ground.marked[x][y] = !ground.marked[x][y]
        return true
    }

    fun explore(x: Int, y: Int): Boolean {
        if (numMines == 0) { setMines(numMinesToBeSet, x, y) }

        val count = countMines(x, y)
        ground.explored[x][y] = count
        if (ground.mines[x][y]) { return false }


        if (count == 0) {
            for (i in x - 1 .. x + 1) {
                for (j in y - 1 .. y + 1) {
                    if (i in 0 until n && j in 0 until n && ground.explored[i][j] == IS_UNEXPLORED) {
                        explore(i, j)
                    }
                }
            }
        }

        return true
    }


    fun isWin(): Boolean {
        if (numMines == 0) { return false }
        if (ground.mines == ground.marked) { return true }

        val unexplored = ground.explored.map { it -> it.map { it == IS_UNEXPLORED } }
        return unexplored == ground.mines
    }
}



fun main() {

    print("How many mines do you want on the field? ")
    val gameField = GameField(N, readln().toInt())
    gameField.print()

    game@while (true) {
        print("Set/unset mine marks or claim a cell as free: ")
        val (yString, xString, command) = readln().split(" ")
        val x = xString.toInt() - 1
        val y = yString.toInt() - 1

        when (command) {
            "mine" -> {
                if (!gameField.mark(x, y)) {
                    println("There is a number here!")
                    continue@game
                }
            }
            "free" -> {
                if (!gameField.explore(x, y)) {
                    println("You stepped on a mine and failed!")
                    break@game
                }
            }
            else -> {
                println("Unknown command")
                continue@game
            }
        }



        if (gameField.isWin()) {
            println("Congratulations! You found all the mines!")
            break
        }

        gameField.print()
    }

    gameField.print()
}
