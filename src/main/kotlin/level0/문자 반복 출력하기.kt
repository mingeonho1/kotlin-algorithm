package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-26
 * **/

/** 문제 설명
문자열 myString과 정수 n이 매개변수로 주어질 때,
myString에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(myString: String, n: Int): String {
    var answer = ""
    for (str in myString) {
        for (i in 1..n) {
            answer += str
        }
    }
    return answer
}
//private fun solution(myString: String, n: Int) = myString.map { it.toString().repeat(n) }.joinToString("")

fun main() {
    val myString = "hello"
    val n = 3
    val result = "hhheeellllllooo"

    checkAnswer(solution(myString, n) == result)
}