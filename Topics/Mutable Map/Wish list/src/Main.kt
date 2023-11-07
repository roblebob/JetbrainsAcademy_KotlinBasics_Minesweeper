fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    // write here
    val list = mutableMapOf<String, Int>()
    for ((k, v) in wishList) {
        if (v <= limit) {
            list += k to v
        }
    }
    return list
}