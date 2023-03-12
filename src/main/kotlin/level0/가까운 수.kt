package level0

import kotlin.math.abs

/**
 * © DEV MING 💻
 * Current date: 2023-03-02
 * **/

/** 문제 설명
정수 배열 array와 정수 n이 매개변수로 주어질 때,
array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요. **/

private fun solution(array: IntArray, n: Int) = array.sorted().minWithOrNull(compareBy { abs(it - n) })!!


fun main() {
    val array = intArrayOf(3, 10, 28)
    val n = 20
    val result = 28

    checkAnswer(solution(array, n) == result)
}