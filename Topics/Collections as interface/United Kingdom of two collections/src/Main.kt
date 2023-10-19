fun main() {
    val oldList = readln().split(" ").toMutableList()
    val oldSet = oldList.toMutableSet()
    val addedList = readln().split(" ").toList()

    addListToCollection(oldList, addedList)
    addListToCollection(oldSet, addedList)

    println(oldList.joinToString(" "))
    println(oldSet.joinToString(" "))
}

// Write here function addListToCollection()
fun addListToCollection(list1: MutableCollection<String>, list2: Collection<String>) {
    list1.addAll(list2)
}