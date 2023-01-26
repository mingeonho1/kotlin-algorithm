package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-26
 * **/

/** 문제 설명
정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.sliceArray(IntRange(num1, num2))

fun main() {
    val numbers = intArrayOf(1, 3, 5)
    val num1 = 1
    val num2 = 2
    val result = intArrayOf(3, 5)

    checkAnswer(solution(numbers, num1, num2).contentEquals(result))
}