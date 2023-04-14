package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-14
 * **/

/** 문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요. **/

private fun solution(x: Int) = x % x.toString().sumOf { it.digitToInt() } == 0

fun main() {
    val arr = 11
    val answer = false
    checkAnswer(solution(arr) == answer)
}