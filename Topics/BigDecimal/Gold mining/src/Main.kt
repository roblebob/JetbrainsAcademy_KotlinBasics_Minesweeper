import java.math.BigDecimal
const val N = 3
fun main() {      
    // write yor code here
    val list = mutableListOf<BigDecimal>()
    repeat(N) {
        list.add(BigDecimal(readln()))
    }
    println(list.reduce { acc, bigDecimal -> acc + bigDecimal })
}