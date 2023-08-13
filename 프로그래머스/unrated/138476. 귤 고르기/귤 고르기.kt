class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        var o = 0
        val tangerineMap = hashMapOf<Int, Int>()

        tangerine.forEach {
            tangerineMap[it] = (tangerineMap[it] ?: 0) + 1
        }
        val valueList = tangerineMap.values.sortedDescending()
        valueList.takeWhile {
            o += it
            answer++
            o < k
        }

        return answer
    }
}