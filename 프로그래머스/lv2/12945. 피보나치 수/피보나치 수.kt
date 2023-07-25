class Solution {
    fun solution(n: Int): Int {
        if (n < 2) return n
        var pair = Pair(0, 1)

        (2..n).forEach { _ ->
            pair = Pair(pair.second, (pair.first + pair.second) % 1234567)
        }
        return pair.second
    }
}