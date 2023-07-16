package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-16
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(park: Array<String>, routes: Array<String>): IntArray {
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
        println(ro)
        val (direction, num) = ro.split(" ")
        val (x, y) = directionMap[direction]!!

        val moveX = x * num.toInt()
        val moveY = y * num.toInt()

        if (startX + moveX in 0..maxX
            && startY + moveY in 0..maxY
        ) {

            var hurdle = false
            if (moveX == 0) {
                for (i in startY..startY + moveY) {
                    println(listOf(startX, i))
                    if (park[startX][i] == 'X') hurdle = true
                }
            } else {
                for (i in startX..startX + moveX) {
                    println(listOf(i, startY))
                    if (park[i][startY] == 'X') hurdle = true
                }
            }

            // 뒤로가는 처리가 안 됨 (추가 필요)
            
            if (!hurdle) {
                startX += moveX
                startY += moveY
            }
        }
    }
    return intArrayOf(startX, startY)
}

fun main() {
    val park = arrayOf("SOOXO", "OOOXO", "OXOOO", "XOOOO")
    val routes = arrayOf("E 2", "S 2", "W 2", "S 1", "W 1")
    val answer = intArrayOf(3, 1)

    checkAnswer(solution(park, routes).contentEquals(answer))
}