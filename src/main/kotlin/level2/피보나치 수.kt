package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-25
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(n: Int): Int {
    val fib = IntArray(n + 1) { 1 }
    (3..n).forEach { i -> fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567 }
    return fib[n]
}

fun main() {
    val n = 5
    val answer = 5

    checkAnswer(solution(n) == answer)
}