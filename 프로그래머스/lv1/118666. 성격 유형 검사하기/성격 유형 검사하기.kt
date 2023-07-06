class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val result = mutableMapOf("RT" to 0, "CF" to 0, "JM" to 0, "AN" to 0)
        for (i in survey.indices) {
            val point = choices[i] - 4
            if (result.containsKey(survey[i])) {
                if (point > 0) result[survey[i]] = result[survey[i]]!! + -point
                else if (point < 0) result[survey[i]] = result[survey[i]]!! + -point
            } else {
                val sortedSur = survey[i].toSortedSet().joinToString("")
                if (point > 0) result[sortedSur] = result[sortedSur]!! + point
                else if (point < 0) result[sortedSur] = result[sortedSur]!! + point
            }
        }

        return result.map { (key, value) ->
            if (value > 0) key.first()
            else if (value < 0) key.last()
            else key.first()
        }.joinToString("")
    }
}