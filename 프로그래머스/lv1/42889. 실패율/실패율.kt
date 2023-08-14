class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val answerHashMap = hashMapOf<Int, Double?>()
        val upHashMap = hashMapOf<Int, Int>()
        val downHashMap = hashMapOf<Int, Int>()
        for (n in 1..N + 1) {
            upHashMap[n] = 0
            downHashMap[n] = stages.count { it >= n }
        }
        for (s in stages) {
            upHashMap[s] = upHashMap[s]!! + 1
        }
        for (n in 1..N) {
            answerHashMap[n] = if (downHashMap[n] == null || downHashMap[n] == 0) {
                0.0
            } else {
                downHashMap[n]?.let { upHashMap[n]?.div(it.toDouble()) } ?: 0.0
            }
        }
        return answerHashMap.toList().sortedByDescending { it.second }.map { it.first }.toIntArray()
    }
}