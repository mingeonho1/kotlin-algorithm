package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-03-07
 * **/

/** 문제 설명
이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
두 이진수의 합을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(bin1: String, bin2: String) =
    Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2))


fun main() {
    val bin1 = "1001"
    val bin2 = "1111"
    val result = "11000"

    checkAnswer(solution(bin1, bin2) == result)
}