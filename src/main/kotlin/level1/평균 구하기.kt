package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-06
 * **/

/** 문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요. **/

private fun solution(arr: IntArray) = arr.average()

fun main() {
    val arr = intArrayOf(1, 2, 3, 4)
    val answer = 2.5
    checkAnswer(solution(arr) == answer)
}