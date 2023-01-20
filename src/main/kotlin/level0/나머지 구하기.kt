package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요. **/

private fun solution(num1: Int, num2: Int) = num1 % num2


fun main() {
    val num1 = 3
    val num2 = 2
    val result = 1

    checkAnswer(solution(num1, num2) == result)
}