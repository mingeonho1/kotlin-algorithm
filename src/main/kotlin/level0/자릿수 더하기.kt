package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-09
 * **/

/** 문제 설명
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요 **/

private fun solution(n: Int) = n.toString().map { it.digitToInt() }.sum()


fun main() {
    val n = 930211
    val result = 16
    checkAnswer(solution(n) == result)
}