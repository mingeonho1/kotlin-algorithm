package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-09
 * **/

/** 문제 설명
문자열 str1, str2가 매개변수로 주어집니다.
str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(str1: String, str2: String) = if (str1.contains(str2)) 1 else 2


fun main() {
    val str1 = "ab6CDE443fgh22iJKlmn1o"
    val str2 = "6CD"
    val result = 1
    checkAnswer(solution(str1, str2) == result)
}