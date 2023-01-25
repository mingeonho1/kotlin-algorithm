package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-25
 * **/

/** 문제 설명
문자열 myString이 매개변수로 주어집니다.
myString을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(myString: String) = myString.reversed()

fun main() {
    val myString = "jaron"
    val result = "noraj"

    checkAnswer(solution(myString) == result)
}