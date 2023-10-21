interface MyInterface {
    fun print()
    var msg: String
}

class MyImplementation : MyInterface {
    override fun print() { println(msg) }
    override var msg: String = "To be, or not to be, that is the question:"

    fun updateMsg(newMsg: String) { msg = newMsg }
}

class CharacterInfoFormatter(base: MyInterface) : MyInterface by base {

    var start: String = msg
    var end: String = "[${msg.length} characters]"

    override fun print() {
        // Your code here
        println("$start $end")
    }
}

fun main() {
    val line = readln()
    val a = MyImplementation()
    a.updateMsg(line)
    val delegate = CharacterInfoFormatter(a)

    delegate.print()
}