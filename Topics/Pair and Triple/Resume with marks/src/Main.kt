fun resume(marks: Triple<String, Int, List<Double>>): Pair<String, Double> {
    // write your code here
    return Pair(marks.first, marks.third.average())
}