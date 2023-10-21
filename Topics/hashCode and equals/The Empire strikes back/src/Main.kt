// complete the definition of the ship 
data class Ship(val name: String, val ammunition: Int) {
    override fun equals(other: Any?): Boolean = when {
        other === this -> true
        other !is Ship -> false
        else -> ammunition == other.ammunition
    }

    override fun hashCode(): Int = ammunition.hashCode()
}