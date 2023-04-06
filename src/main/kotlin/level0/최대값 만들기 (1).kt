package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-01-25
 * **/

/** 문제 설명
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(numbers: IntArray): Int {
    val arrSize: Int = numbers.size
    val sortedNumbers: IntArray = numbers.sortedArray()
    return sortedNumbers[arrSize - 1] * sortedNumbers[arrSize - 2]
}

fun main() {
    val numbers = intArrayOf(0, 31, 24, 10, 1, 9)
    val result = 744

    checkAnswer(solution(numbers) == result)
}