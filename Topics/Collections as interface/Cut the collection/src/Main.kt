fun main() {
     val originalList = readln().split(" ")
    val originalSet = originalList.toSet()
    val word = readln()

    println(dropElements(originalList, word))
    println(dropElements(originalSet, word))
}

// Write function dropElements() here
fun <T> dropElements(collection: Collection<T>, word: T): Collection<T> =  collection.filter { it != word }


