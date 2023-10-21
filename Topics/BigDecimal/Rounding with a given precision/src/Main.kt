import java.math.BigDecimal
import java.math.RoundingMode

fun main() {             
    // write your code here
    println(readln().toBigDecimal().setScale(readln().toInt(), RoundingMode.HALF_DOWN))
}