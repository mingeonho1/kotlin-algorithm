package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-13
 * **/

/** 문제 설명
문자열 myString이 매개변수로 주어질 때,
대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(myString: String): String {
    var answer = ""
    for (s in myString) {
        answer += if (s.isUpperCase()) {
            s.lowercaseChar()
        } else {
            s.uppercaseChar()
        }
    }
    return answer
}


fun main() {
    val myString = "abCdEfghIJ"
    val result = "ABcDeFGHij"

    checkAnswer(solution(myString) == result)
}