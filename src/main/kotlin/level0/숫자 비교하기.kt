package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
정수 num1과 num2가 매개변수로 주어집니다.
두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요. **/

private fun solution(num1: Int, num2: Int) = if (num1 == num2) 1 else -1


fun main() {
    val num1 = 7
    val num2 = 99
    val result = -1

    checkAnswer(solution(num1, num2) == result)
}