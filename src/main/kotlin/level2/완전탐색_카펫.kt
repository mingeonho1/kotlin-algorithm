package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-27
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(brown: Int, yellow: Int): IntArray {
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

fun main() {
    val brown = 10
    val yellow = 2
    val answer = intArrayOf(4, 3)

    checkAnswer(solution(brown, yellow).contentEquals(answer))
}