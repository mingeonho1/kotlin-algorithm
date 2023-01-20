package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요. **/

private fun solution(num1: Int, num2: Int) = (num1 * 1000) / num2


fun main() {
    val num1 = 1
    val num2 = 16
    val result = 62

    checkAnswer(solution(num1, num2) == result)
}