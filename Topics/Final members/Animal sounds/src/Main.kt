// make your class Animal here
open class Animal {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}
// make your class Dog here
class Dog : Animal() {
    override fun makeSound() {
        println("The dog barks")
    }
}