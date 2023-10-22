/*class StoredNode(private val name: String, private val age: Int, var next : StoredNode? = null){

    fun toNodeString(): String {
        return "Name $name age $age"
    }
}

class ListStorage (var head: StoredNode, var tail: StoredNode = head) : Iterable<StoredNode> {

    fun add(newNode: StoredNode) {
        tail.next = newNode
        tail = newNode
    }

    override fun iterator(): Iterator<StoredNode> {
        return ListStorageIterator(this)
    }
}*/


class ListStorageIterator(private val workTeam: ListStorage) : Iterator<StoredNode> {

    lateinit var current: StoredNode
    private var isAccessed: Boolean = false

    override fun hasNext(): Boolean {
        // put your code here
        return when {
            !isAccessed -> true
            current.next != null -> true
            else -> false
        }
    }

    override fun next(): StoredNode {
        // put your code here
        if (!isAccessed) {
            current = workTeam.head
            isAccessed = true
            return current
        }

        if (current.next == null) throw NoSuchElementException()

        current = current.next!!
        return current
    }
}

fun main() {
    // don't change this code
    val listStorage = ListStorage(StoredNode("Nik", 30))
    listStorage.add(StoredNode("Sofi", 25))
    listStorage.add(StoredNode("Mike", 45))
    val iterStorage = listStorage.iterator()
    while (iterStorage.hasNext()){
        println(iterStorage.next().toNodeString())
    }
}