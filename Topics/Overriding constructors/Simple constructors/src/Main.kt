open class Animal(open val name: String, open val age: Int)

class Dog(override val name: String, override val age: Int) : Animal(name, age)