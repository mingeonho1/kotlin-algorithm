package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-01-26
 * **/

/** 문제 설명
정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 level0.solution 함수를 완성해보세요. **/

private fun solution(array: IntArray, n: Int) = array.count { it == n }

fun main() {
    val array = intArrayOf(1, 1, 2, 3, 4, 5)
    val n = 1
    val result = 2

    checkAnswer(solution(array, n) == result)
}