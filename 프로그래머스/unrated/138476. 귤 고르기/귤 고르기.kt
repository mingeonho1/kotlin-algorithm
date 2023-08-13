class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val tangerineMap = tangerine.groupBy { it }.mapValues { it.value.size }
        val valueList = tangerineMap.values.sortedDescending()

        var answer = 0
        var sum = 0

        valueList.takeWhile { sum += it; answer++; sum < k }
        return answer
    }
}