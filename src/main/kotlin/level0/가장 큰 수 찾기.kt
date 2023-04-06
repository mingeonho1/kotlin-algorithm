package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-22
 * **/

/** 문제 설명
정수 배열 array가 매개변수로 주어질 때,
가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(array: IntArray): IntArray {
    val max = array.maxOf { it }
    val index = array.indexOf(max)
    return intArrayOf(max, index)
}


fun main() {
    val array = intArrayOf(9, 10, 11, 8)
    val result = intArrayOf(11, 2)

    checkAnswer(solution(array).contentEquals(result))
}