class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var _a = a
        var _b = b

        while (_a != _b) {
            _a = (_a + 1) / 2
            _b = (_b + 1) / 2
            answer++
        }

        return answer
    }
}