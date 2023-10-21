import java.math.BigDecimal
import java.math.RoundingMode
const val N = 3

fun main() {
    // write your code here
    val list = mutableListOf<BigDecimal>()
    repeat(N) {
        list.add(BigDecimal(readln()))
    }
    list.reduce { acc, bigDecimal -> acc + bigDecimal }.divide(BigDecimal(N), 0, RoundingMode.DOWN)
        .let { println(it) }
}