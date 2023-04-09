package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-09
 * **/

/** 문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요. **/

private fun solution(x: Int, n: Int): LongArray {
    var answer = longArrayOf()
    var a: Long = x.toLong()
    for (i in 1..n) {
        answer += a * i
    }
    return answer
}

//private fun solution(x: Int, n: Int) = (1..n).map { x.toLong() * it }.toLongArray()

fun main() {
    val x = 2
    val n = 5
    val answer = longArrayOf(2, 4, 6, 8, 10)
    checkAnswer(solution(x, n).contentEquals(answer))
}