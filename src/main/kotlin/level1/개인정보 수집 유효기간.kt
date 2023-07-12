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

    val todayDate = today.replace(".", "").toInt()

    return privacies.mapIndexedNotNull { index, privacy ->
        val (date, type) = privacy.split(" ")
        var (year, month, day) = date.split(".").map { it.toInt() }

        month += termsMap[type]!!

        while (month > 12) {
            year += month / 12
            month %= 12
        }

        if (month <= 0) {
            month += 12
        }

        val parsingMonth = if (month < 10) "0$month" else month.toString()

        if (day == 1) {
            day = 28
            month -= 1
        } else {
            day -= 1
        }

        val parsingDay = if (day < 10) "0$day" else day.toString()

        val newDate = "$year$parsingMonth$parsingDay".toInt()
        if (todayDate > newDate) index + 1 else null
    }.toIntArray()
}

fun main() {
    val today = "2022.05.19"
    val terms = arrayOf("A 6", "B 12", "C 3")
    val privacies = arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")
    val answer = intArrayOf(1, 3)

    checkAnswer(solution(today, terms, privacies).contentEquals(answer))
}