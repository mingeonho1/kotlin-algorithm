package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-10
 * **/

/** 문제 설명
문자열 myString이 매개변수로 주어집니다.
myString안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(myString: String) = myString.replace("[^0-9]".toRegex(), "").map { it.digitToInt() }.sum()

fun main() {
    val myString = "aAb1B2cC34oOp"
    val result = 10

    checkAnswer(solution(myString) == result)
}