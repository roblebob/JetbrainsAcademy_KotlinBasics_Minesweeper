fun isReversed(pair: Pair<String, String>): Triple<String, String, Boolean> =
    with(pair) { Triple(first, second, first.lowercase() == second.lowercase().reversed()) }