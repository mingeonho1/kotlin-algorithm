package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-03
 * **/

/** 문제 설명
덧셈, 뺄셈 수식들이 'X 연산자 Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(quiz: Array<String>): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    for (q in quiz) {
        answer += if (q.contains("+")) {
            val n = q.split(" + ", " = ")
            if (n[0].toInt() + n[1].toInt() == n[2].toInt()) {
                "O"
            } else {
                "X"
            }
        } else {
            val n = q.split(" - ", " = ")
            if (n[0].toInt() - n[1].toInt() == n[2].toInt()) {
                "O"
            } else {
                "X"
            }
        }

    }
    return answer
}


fun main() {
    val quiz = arrayOf("3 - 4 = -3", "5 + 6 = 11")
    val result = arrayOf("X", "O")

    checkAnswer(solution(quiz).contentEquals(result))
}