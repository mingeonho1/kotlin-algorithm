class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val directionMap = mapOf(
            "W" to intArrayOf(0, -1),
            "S" to intArrayOf(1, 0),
            "E" to intArrayOf(0, 1),
            "N" to intArrayOf(-1, 0)
        )

        val maxX = park.size - 1
        val maxY = park[0].length - 1

        val startPosition = park.indices.flatMap { i ->
            park[i].indices.map { n ->
                if (park[i][n] == 'S') Pair(i, n) else null
            }
        }.first { it != null }!!

        var (startX, startY) = startPosition

        for (ro in routes) {
            val (direction, num) = ro.split(" ")
            val (x, y) = directionMap[direction]!!

            val moveX = x * num.toInt()
            val moveY = y * num.toInt()

            val finalX = startX + moveX
            val finalY = startY + moveY

            if (finalX in 0..maxX && finalY in 0..maxY
                && startX in 0..maxX && startY in 0..maxY
            ) {
                val hurdle = if (moveX == 0) {
                    val range = if (moveY >= 0) startY..finalY else startY downTo finalY
                    range.any { i -> park[startX][i] == 'X' }
                } else {
                    val range = if (moveX >= 0) startX..finalX else startX downTo finalX
                    range.any { i -> park[i][startY] == 'X' }
                }

                if (!hurdle) {
                    startX += moveX
                    startY += moveY
                }
            }
        }
        return intArrayOf(startX, startY)
    }
}