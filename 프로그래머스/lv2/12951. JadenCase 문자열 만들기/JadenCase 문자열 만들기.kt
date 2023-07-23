import java.util.*

class Solution {
    fun solution(s: String) = s.split(" ")
        .joinToString(" ") { it ->
            it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }.lowercase()
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }
}