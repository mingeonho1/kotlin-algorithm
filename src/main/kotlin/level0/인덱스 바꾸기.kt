package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-21
 * **/

/** 문제 설명
문자열 myString과 정수 num1, num2가 매개변수로 주어질 때,
myString에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(myString: String, num1: Int, num2: Int): String {
    var answer = ""
    for (i in myString.indices) {
        answer += when (i) {
            num1 -> myString[num2]
            num2 -> myString[num1]
            else -> myString[i]
        }
    }
    return answer
}

fun main() {
    val myString = "I love you"
    val num1 = 3
    val num2 = 6
    val result = "I l veoyou"
    checkAnswer(solution(myString, num1, num2) == result)
}