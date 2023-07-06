package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-06
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(survey: Array<String>, choices: IntArray): String {
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

fun main() {
    val survey = arrayOf("AN", "CF", "MJ", "RT", "NA")
    val choices = intArrayOf(5, 3, 2, 7, 5)
    val answer = "TCMA"

    checkAnswer(solution(survey, choices) == answer)
}