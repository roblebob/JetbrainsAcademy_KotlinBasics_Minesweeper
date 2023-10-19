data class User(val name: String, val age: Int, val email: String)

class UserComparator : Comparator<User> {
    // write your code here
    override fun compare(o1: User?, o2: User?): Int {
        if (o1 == null || o2 == null) return 0
        return when {
            o1.age == o2.age -> o1.name.compareTo(o2.name)
            else -> o1.age.compareTo(o2.age)
        }
    }
}