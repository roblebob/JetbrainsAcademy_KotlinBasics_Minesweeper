class Solution {
    fun applyTransformation(numbers: List<Int>, transformation: (Int) -> Int): List<Int> {
         return numbers.map(transformation)
    }
}