package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-14
 * **/

/** 문제 설명
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요. **/

private fun solution(s: String) = if (s.contains("-")) -s.replace("-", "").toInt() else s.toInt()

// 이게 돼? ㅎㅎ..
//private fun solution(s: String) = s.toInt()

fun main() {
    val s = "-1234"
    val answer = -1234
    checkAnswer(solution(s) == answer)
}