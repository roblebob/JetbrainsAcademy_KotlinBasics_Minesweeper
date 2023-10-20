fun main() {
    var a = readln()
    var b = readln()
    // Write your code here
    b = a.also { a = b }
    println(a)
    println(b)
}