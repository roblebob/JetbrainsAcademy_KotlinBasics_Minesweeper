package minesweeper

import kotlin.random.Random

class GameField(val N: Int, numMines: Int) {
    val ground = MutableList(N) { MutableList(N) { false } }



    init {
        repeat(numMines) {
            while (true) {
                val x = Random.nextInt(0, N)
                val y = Random.nextInt(0, N)
                if (ground[x][y]) {
                    continue
                }
                ground[x][y] = true
                break
            }
        }
    }




    fun print() {
        for (i in 0 until N) {
            for (j in 0 until N) {
                print(if (ground[i][j]) "X" else ".")
            }
            println()
        }
    }
}



fun main() {
    print("How many mines do you want on the field? ")
    val numMines = readln().toInt()
    val gameField = GameField(9, numMines)
    gameField.print()
}
