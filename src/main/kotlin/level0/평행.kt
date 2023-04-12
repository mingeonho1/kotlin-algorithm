package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-11
 * **/

/** 문제 설명
점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.

[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(dots: Array<IntArray>): Int {
    return if ((dots[0][1] - dots[1][1]).toDouble() / (dots[0][0] - dots[1][0]).toDouble()
        == (dots[2][1] - dots[3][1]).toDouble() / (dots[2][0] - dots[3][0]).toDouble()
    ) {
        1
    } else if ((dots[0][1] - dots[2][1]).toDouble() / (dots[0][0] - dots[2][0]).toDouble()
        == (dots[1][1] - dots[3][1]).toDouble() / (dots[1][0] - dots[3][0]).toDouble()
    ) {
        1
    } else if ((dots[0][1] - dots[3][1]).toDouble() / (dots[0][0] - dots[3][0]).toDouble()
        == (dots[1][1] - dots[2][1]).toDouble() / (dots[1][0] - dots[2][0]).toDouble()
    ) {
        1
    } else {
        0
    }
}

fun main() {
    val dots = arrayOf(
        intArrayOf(1, 4), intArrayOf(9, 2), intArrayOf(3, 8), intArrayOf(11, 6)
    )
    val result = 1

    checkAnswer(solution(dots) == result)
}