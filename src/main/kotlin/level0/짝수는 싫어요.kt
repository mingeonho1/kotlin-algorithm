package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-25
 * **/

/** 문제 설명
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(n: Int) = (0..n).filter { it % 2 == 1 }.toIntArray()

fun main() {
    val n = 15
    val result = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15)

    checkAnswer(solution(n).contentEquals(result))
}