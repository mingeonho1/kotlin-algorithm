package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
정수가 들어 있는 배열 numList가 매개변수로 주어집니다.
numList의 원소의 순서를 거꾸로 뒤집은 배열을 return 하도록 solution 함수를 완성해주세요. **/

private fun solution(numList: IntArray) = numList.reversedArray()


fun main() {
    val numList = intArrayOf(1, 0, 1, 1, 1, 3, 5)
    val result = intArrayOf(5, 3, 1, 1, 1, 0, 1)

    checkAnswer(solution(numList).contentEquals(result))
}