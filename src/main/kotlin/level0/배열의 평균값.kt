package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(numbers: IntArray) = numbers.average()


fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = 5.5

    checkAnswer(solution(numbers) == result)
}