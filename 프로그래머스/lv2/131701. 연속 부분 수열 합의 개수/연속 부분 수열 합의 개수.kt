class Solution {
    fun solution(elements: IntArray): Int {
        val n = elements.size
        val extendedElements = IntArray(2 * n)

        for (i in extendedElements.indices) {
            extendedElements[i] = elements[i % n]
        }

        val uniqueSums = mutableSetOf<Int>()

        for (i in 1..elements.size) {
            for (j in 0..elements.size) {
                uniqueSums.add(extendedElements.copyOfRange(j, j + i).sum())
            }
        }

        return uniqueSums.size
    }
}