fun main() {
    val map = mapOf(
        "NG" to "Nigeria", 
        "AU" to "Australia", 
        "CA" to "Canada", 
        "BG" to "Bulgaria", 
        "DE" to "Germany"
    )
    val mapIterator = map.iterator()
    val input = readln().uppercase()
    // put your code here
    while (mapIterator.hasNext()) {
        val el = mapIterator.next()
        if (el.key == input) {
            println(el.value)
            break
        }
    }
}