// complete the definition
infix fun List<Ship>.battle(ammunitionLimit: Int): List<String> =
    this.filter { it.ammunition > ammunitionLimit }.map { it.name }

data class Ship(val name: String, val ammunition: Int)