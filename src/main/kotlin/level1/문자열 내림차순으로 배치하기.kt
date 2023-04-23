package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-23
 * **/

/** 문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다. **/

/** 제한 조건
a, b의 길이는 1 이상 1,000 이하입니다.
a, b의 모든 수는 -1,000 이상 1,000 이하입니다. **/

private fun solution(s: String) = s.toList().sortedDescending().joinToString("")

fun main() {
    val s = "Zbcdefg"
    val answer = "gfedcbZ"

    checkAnswer(solution(s) == answer)
}