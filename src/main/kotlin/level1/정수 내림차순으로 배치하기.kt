package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-14
 * **/

/** 문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다. **/

private fun solution(n: Long) = n.toString().map { it }.sortedDescending().joinToString("").toLong()

fun main() {
    val n: Long = 118372
    val answer: Long = 873211
    checkAnswer(solution(n) == answer)
}