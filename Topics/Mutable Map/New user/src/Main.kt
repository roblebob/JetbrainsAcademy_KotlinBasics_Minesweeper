fun addUser(userMap: Map<String, String>, login: String, password: String): MutableMap<String, String> {
    // write your code here
    if (userMap.contains(login)) {
        println("User with this login is already registered!")
        return userMap.toMutableMap()
    }
    val newMap = userMap.toMutableMap()
    newMap += login to password
    return newMap
}