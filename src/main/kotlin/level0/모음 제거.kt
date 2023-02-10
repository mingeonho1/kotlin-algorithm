package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-10
 * **/

/** 문제 설명
영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
문자열 myString이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(myString: String) = myString.replace("[a|e|i|o|u]".toRegex(), "")

fun main() {
    val myString = "nice to meet you"
    val result = "nc t mt y"

    checkAnswer(solution(myString) == result)
}