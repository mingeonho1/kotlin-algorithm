package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-14
 * **/

/** 문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다. **/

private fun solution(n: Long) = n.toString().map { it.digitToInt() }.reversed().toIntArray()

fun main() {
    val n: Long = 12345
    val answer = intArrayOf(5, 4, 3, 2, 1)
    checkAnswer(solution(n).contentEquals(answer))
}