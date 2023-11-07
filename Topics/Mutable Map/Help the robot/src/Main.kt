fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>) : MutableMap<String, Int> {
    //write your code here
    val result = purchases.toMutableMap()
    for ((key, value) in addition) {
        result[key] = result.getOrDefault(key, 0) + value
    }
    return result
}