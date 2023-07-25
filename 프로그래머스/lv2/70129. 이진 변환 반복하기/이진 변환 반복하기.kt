class Solution {
    fun solution(s: String): IntArray {
        var transformationCount = 0
        var totalZeroCount = 0
        var binaryString = s

        while (binaryString != "1") {
            val zeroCount = binaryString.count { it == '0' }
            val nonZeroCount = binaryString.length - zeroCount

            totalZeroCount += zeroCount
            binaryString = nonZeroCount.toString(2)

            transformationCount++
        }

        return intArrayOf(transformationCount, totalZeroCount)
    }
}