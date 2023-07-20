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

        var startX = 0
        var startY = 0
        var breaker = false

        for (i in park.indices) {
            for (n in park[i].indices) {
                if (park[i][n] == 'S') {
                    startX = i
                    startY = n
                    breaker = true
                }
            }
            if (breaker) break
        }


        for (ro in routes) {
            val (direction, num) = ro.split(" ")
            val (x, y) = directionMap[direction]!!

            val moveX = x * num.toInt()
            val moveY = y * num.toInt()

            val finalX = startX + moveX
            val finalY = startY + moveY

            // 뒤로 움직일 때를 고려한 조건
            if (finalX in 0..maxX && finalY in 0..maxY
                && startX in 0..maxX && startY in 0..maxY
            ) {
                var hurdle = false
                if (moveX == 0) {
                    val range = if (moveY >= 0) startY..finalY else startY downTo finalY
                    for (i in range) {
                        if (park[startX][i] == 'X') hurdle = true
                    }
                } else {
                    val range = if (moveX >= 0) startX..finalX else startX downTo finalX
                    for (i in range) {
                        if (park[i][startY] == 'X') hurdle = true
                    }
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