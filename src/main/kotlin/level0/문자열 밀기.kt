package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-17
 * **/

/** 문제 설명
문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고
밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(A: String, B: String): Int {
    var answer: Int = -1
    var data = A
    for (i in data.indices) {
        if (data == B) {
            answer = i
            break
        }
        val string1 = data.substring(data.length - 1)
        val string2 = data.substring(0, data.length - 1)
        data = string1 + string2
    }
    return answer
}

fun main() {
    val A = "hello"
    val B = "ohell"
    val result = 1

    checkAnswer(solution(A, B) == result)
}