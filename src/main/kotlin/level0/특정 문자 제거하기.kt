package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-01-26
 * **/

/** 문제 설명
문자열 myString과 문자 letter이 매개변수로 주어집니다.
myString에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(myString: String, letter: String) = myString.replace(letter, "")

fun main() {
    val myString = "BCBdbe"
    val letter = "B"
    val result = "Cdbe"

    checkAnswer(solution(myString, letter) == result)
}