package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-24
 * **/

/** 문제 설명
영어 대소문자로 이루어진 문자열 myString이 매개변수로 주어질 때,
myString을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(myString: String) = myString.lowercase().toCharArray().apply { sort() }.joinToString("")


fun main() {
    val myString = "heLLo"
    val result = "ehllo"

    checkAnswer(solution(myString) == result)
}