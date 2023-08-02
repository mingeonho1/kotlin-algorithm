package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-08-02
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(n: Int): Long {
    val dp = LongArray(n + 1) { 1 } // dp[0] = 1 // dp[1] = 1

    // DP(Dynamic Programming)
    for (i in 2..n) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
    }
    return dp[n]
}

fun main() {
    val n = 4
    val answer = 5L

    checkAnswer(solution(n) == answer)
}