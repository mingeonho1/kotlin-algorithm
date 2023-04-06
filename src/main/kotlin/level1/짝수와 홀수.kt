package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-06
 * **/

/** 문제 설명
정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요. **/

private fun solution(num: Int) = if (num % 2 == 0) "Even" else "Odd"

fun main() {
    val num = 3
    val answer = "Odd"
    checkAnswer(solution(num) == answer)
}