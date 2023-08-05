import kotlin.math.abs

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        val keypad = mapOf(
            1 to intArrayOf(0, 0), 2 to intArrayOf(0, 1), 3 to intArrayOf(0, 2),
            4 to intArrayOf(1, 0), 5 to intArrayOf(1, 1), 6 to intArrayOf(1, 2),
            7 to intArrayOf(2, 0), 8 to intArrayOf(2, 1), 9 to intArrayOf(2, 2),
            '*' to intArrayOf(3, 0), 0 to intArrayOf(3, 1), '#' to intArrayOf(3, 2)
        )
        var lLoc = intArrayOf(3, 0)
        var rLoc = intArrayOf(3, 2)
        for (num in numbers) {
            when (num) {
                1, 4, 7 -> {
                    answer += "L"
                    lLoc = keypad[num]!!
                }

                3, 6, 9 -> {
                    answer += "R"
                    rLoc = keypad[num]!!
                }

                else -> {
                    val mLoc = keypad[num]!!
                    val lDistance = abs(lLoc[0] - mLoc[0]) + abs(lLoc[1] - mLoc[1])
                    val rDistance = abs(rLoc[0] - mLoc[0]) + abs(rLoc[1] - mLoc[1])

                    if (lDistance > rDistance) {
                        answer += "R"
                        rLoc = keypad[num]!!
                    } else if (lDistance < rDistance) {
                        answer += "L"
                        lLoc = keypad[num]!!
                    } else {
                        val loc = hand.first().uppercase()
                        answer += loc
                        if (loc == "L") lLoc = keypad[num]!! else rLoc = keypad[num]!!
                    }
                }
            }
        }
        return answer
    }
}