abstract class Shape {
    // make your code here
    abstract val area: Int
}

class Square(val side: Double) : Shape() {
    // make your code here
    override val area: Int
        get() = (side * side).toInt()
}