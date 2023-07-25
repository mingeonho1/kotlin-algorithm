class Solution {
    fun solution(n: Int): Int {
        val fib = IntArray(n + 1) { 1 }
        (3..n).forEach { i -> fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567 }
        return fib[n]
    }
}