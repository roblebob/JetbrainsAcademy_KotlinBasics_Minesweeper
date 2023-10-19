import java.math.BigDecimal
import java.math.RoundingMode     

fun main() {
    // write your code here
    val power = readln().toInt()
    val mode = readln().toInt()
    val number = readln().toBigDecimal()
    val result = number.setScale(mode, RoundingMode.FLOOR).pow(power)
    println(result)
}