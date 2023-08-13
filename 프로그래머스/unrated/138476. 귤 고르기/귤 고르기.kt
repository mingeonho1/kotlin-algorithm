class Solution {
    fun solution(k: Int, tangerine: IntArray): Int =
        tangerine.groupBy { it }.values.map { it.size }.sortedDescending().runningFold(0) { acc, i -> acc + i }
            .indexOfFirst { it >= k }.takeIf { it != -1 } ?: tangerine.size
}