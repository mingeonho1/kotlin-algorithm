package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-01-25
 * **/

/** 문제 설명
정수가 담긴 리스트 numList가 주어질 때,
numList의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(numList: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    answer = answer.plus(numList.filter { it % 2 == 0 }.size)
    answer = answer.plus(numList.filter { it % 2 == 1 }.size)
    return answer
}

fun main() {
    val numList = intArrayOf(1, 3, 5, 7)
    val result = intArrayOf(0, 4)

    checkAnswer(solution(numList).contentEquals(result))
}