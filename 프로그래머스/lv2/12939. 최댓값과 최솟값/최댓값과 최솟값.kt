class Solution {
    fun solution(s: String)= s.split(" ").run {
        "${minOf { it.toInt() }} ${maxOf { it.toInt() }}"
    }
}