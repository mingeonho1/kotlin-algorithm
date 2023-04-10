package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-10
 * **/

/** 문제 설명
선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]]
형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,두 개 이상의 선분이 겹치는 부분의 길이를
return 하도록 solution 함수를 완성해보세요.

lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다. **/

private fun solution(lines: Array<IntArray>): Int {
    var answer = 0
    for (it in -100..100) {
        var count = 0

        if (lines[0][0] <= it && lines[0][1] > it) count++
        if (lines[1][0] <= it && lines[1][1] > it) count++
        if (lines[2][0] <= it && lines[2][1] > it) count++

        if (count > 1) {
            answer++
        }
    }

    return answer
}

fun main() {
    val lines = arrayOf(
        intArrayOf(0, 1), intArrayOf(2, 5), intArrayOf(3, 9)
    )
    val result = 2

    checkAnswer(solution(lines) == result)
}