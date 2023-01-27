package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-27
 * **/

/** 문제 설명
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(numbers: IntArray) = numbers.map { it * 2 }.toIntArray()

fun main() {
    val numbers = intArrayOf(1, 2, 100, -99, 1, 2, 3)
    val result = intArrayOf(2, 4, 200, -198, 2, 4, 6)

    checkAnswer(solution(numbers).contentEquals(result))
}