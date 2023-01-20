package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요. **/

private fun solution(age: Int) = 2022 - (age - 1)


fun main() {
    val age = 40
    val result = 1983

    checkAnswer(solution(age) == result)
}