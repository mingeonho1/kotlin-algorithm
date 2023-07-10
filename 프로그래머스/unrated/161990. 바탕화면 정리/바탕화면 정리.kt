class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        val xList = mutableListOf<Int>()
        val yList = mutableListOf<Int>()
        for (i in wallpaper.indices) {
            for (n in wallpaper[i].indices) {
                if (wallpaper[i][n] == '#') {
                    xList += i
                    yList += n
                }
            }
        }
        return intArrayOf(xList.minOf { it }, yList.minOf { it }, xList.maxOf { it } + 1, yList.maxOf { it } + 1)
    }
}