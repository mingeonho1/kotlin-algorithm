package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-31
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

private fun lcm(a: Int, b: Int) = a * b / gcd(a, b)

private fun solution(arr: IntArray): Int {
    var answer = arr[0]
    arr.forEach { answer = lcm(answer, it) }
    return answer
}

fun main() {
    val arr = intArrayOf(2, 6, 8, 14)
    val answer = 168
    checkAnswer(solution(arr) == answer)
}