class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var num = 0
        val plus = lottos.count { it == 0 }
        if (plus == 6) {
            return intArrayOf(1, 6)
        }
        for (lo in lottos) {
            if (win_nums.contains(lo)) num++
        }
        return when (num) {
            6 -> intArrayOf(1, 1)
            5 -> intArrayOf(2 - plus, 2)
            4 -> intArrayOf(3 - plus, 3)
            3 -> intArrayOf(4 - plus, 4)
            2 -> intArrayOf(5 - plus, 5)
            else -> intArrayOf(6 - plus, 6)
        }
    }
}