package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-29
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(n: Int, a: Int, b: Int): Int {
    var answer = 0
    var _a = a
    var _b = b

    while (_a != _b) {
        _a = (_a + 1) / 2
        _b = (_b + 1) / 2
        answer++
    }

    return answer
}

fun main() {
    val N = 8
    val A = 5
    val B = 4
    val answer = 3

    checkAnswer(solution(N, A, B) == answer)
}