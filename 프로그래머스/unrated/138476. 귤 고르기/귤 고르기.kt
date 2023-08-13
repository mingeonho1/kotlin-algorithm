class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val valueList = tangerine.groupBy { it }.mapValues { it.value.size }.values.sortedDescending()

        var answer = 0
        var sum = 0

        valueList.takeWhile { sum += it; answer++; sum < k }
        return answer
    }
}