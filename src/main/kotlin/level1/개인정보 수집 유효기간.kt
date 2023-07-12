package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-12
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    val termsMap = terms.associate {
        it.split(" ")[0] to it.split(" ")[1].toInt()
    }

    val toadyTotal = total(today)

    return privacies.mapIndexedNotNull { index, privacy ->
        val (date, type) = privacy.split(" ")
        val day = termsMap[type]!! * 28

        if (toadyTotal >= total(date) + day) index + 1 else null
    }.toIntArray()
}

private fun total(date: String): Int {
    val (yyyy, mm, dd) = date.split(".").map(String::toInt)
    return yyyy * 12 * 28 + mm * 28 + dd
}

fun main() {
    val today = "2022.05.19"
    val terms = arrayOf("A 6", "B 12", "C 3")
    val privacies = arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")
    val answer = intArrayOf(1, 3)

    checkAnswer(solution(today, terms, privacies).contentEquals(answer))
}