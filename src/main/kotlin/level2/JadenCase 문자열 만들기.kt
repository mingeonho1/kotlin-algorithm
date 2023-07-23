package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-23
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(s: String) = s.split(" ").run {
    "${minOf { it.toInt() }} ${maxOf { it.toInt() }}"
}

fun main() {
    val s = "-1 -2 -3 -4"
    val answer = "-4 -1"

    checkAnswer(solution(s) == answer)
}