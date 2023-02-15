package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-15
 * **/

/** 문제 설명
정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(n: Int, numlist: IntArray) = numlist.filter { it % n == 0 }.toIntArray()

fun main() {
    val n = 3
    val numlist = intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12)
    val result = intArrayOf(6, 9, 12)
    checkAnswer(solution(n, numlist).contentEquals(result))
}