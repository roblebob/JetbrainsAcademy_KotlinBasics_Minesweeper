fun isPalindrome(word: String): Boolean {
    val deque = ArrayDeque<Char>()

    for (char in word) {
        deque.addLast(char)
    }

    while (deque.size > 1) {
        // make your code here
        if (deque.removeFirst() != deque.removeLast()) return false
    }

    return true
}