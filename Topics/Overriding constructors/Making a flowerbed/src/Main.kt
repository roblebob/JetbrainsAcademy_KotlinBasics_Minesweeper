open class Plant(open val name: String)

open class Flower(override val name: String, open val color: String) : Plant(name)

class Flowerbed(override val color: String, override val name: String) : Flower(name, color) {
    fun print() {
        println("This flowerbed has many $color ${name}s")
    }
}