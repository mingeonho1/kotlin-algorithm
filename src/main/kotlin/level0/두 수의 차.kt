package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요. **/

private fun solution(num1: Int, num2: Int) = num1 - num2


fun main() {
    val num1 = 2
    val num2 = 3
    val result = -1

    checkAnswer(solution(num1, num2) == result)
}