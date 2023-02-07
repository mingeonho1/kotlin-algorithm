package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-07
 * **/

/** 문제 설명
두 배열이 얼마나 유사한지 확인해보려고 합니다.
문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(s1: Array<String>, s2: Array<String>): Int {
    var answer: Int = 0
    for (s in s1) {
        answer += s2.count { s == it }
    }
    return answer
}

//private fun solution(s1: Array<String>, s2: Array<String>) = s1.count { s2.contains(it) }

fun main() {
    val s1 = arrayOf("a", "b", "c")
    val s2 = arrayOf("com", "b", "d", "p", "c")
    val result = 2

    checkAnswer(solution(s1, s2) == result)
}