class Solution {
    fun solution(n: Int): Long {
        val dp = LongArray(n + 1) { 1 } // dp[0] = 1 // dp[1] = 1

        // DP(Dynamic Programming)
        for (i in 2..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
        }
        return dp[n]
    }
}