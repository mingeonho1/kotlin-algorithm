class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val area = brown + yellow
        for (height in 3..area) {
            if (area % height != 0) continue

            val width = area / height

            if ((height - 2) * (width - 2) == yellow) {
                return intArrayOf(width, height)
            }
        }

        return intArrayOf(0, 0)
    }
}