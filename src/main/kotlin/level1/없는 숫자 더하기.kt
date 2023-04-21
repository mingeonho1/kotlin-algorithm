package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-21
 * **/

/** 문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요. **/

/** 제한 조건
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 원소 ≤ 9
numbers의 모든 원소는 서로 다릅니다. **/

private fun solution(numbers: IntArray) = (1..9).filter { !numbers.contains(it) }.sum()

fun main() {
    val numbers = intArrayOf(5, 8, 4, 0, 6, 7, 9)
    val answer = 6

    checkAnswer(solution(numbers) == answer)
}