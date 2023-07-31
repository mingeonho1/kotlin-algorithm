class Solution {
    private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

    private fun lcm(a: Int, b: Int) = a * b / gcd(a, b)

    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        arr.forEach { answer = lcm(answer, it) }
        return answer
    }
}