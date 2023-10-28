open class Vehicle {
    open fun move(speed: Int, direction: String) {
        println("Moving at $speed km/h towards $direction")
    }
}

class Car : Vehicle() {
    override fun move(speed: Int, direction: String) {
        println("Driving at $speed km/h towards $direction")
    }
}