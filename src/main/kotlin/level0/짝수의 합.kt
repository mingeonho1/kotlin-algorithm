package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-01-25
 * **/

/** 문제 설명
정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요. **/

private fun solution(n: Int): Int {
    var answer: Int = 0
    for (i in 0..n step (2)) {
        answer += i
    }
    return answer
}

fun main() {
    val n = 10
    val result = 30

    checkAnswer(solution(n) == result)
}