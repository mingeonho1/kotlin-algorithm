package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-22
 * **/

/** 문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다. **/

/** 제한 조건
n은 길이 10,000이하인 자연수입니다. **/

private fun solution(n: Int) = if (n % 2 == 0) "수박".repeat(n / 2) else "수박".repeat(n / 2) + "수"

fun main() {
    val n = 3
    val answer = "수박수"

    checkAnswer(solution(n) == answer)
}