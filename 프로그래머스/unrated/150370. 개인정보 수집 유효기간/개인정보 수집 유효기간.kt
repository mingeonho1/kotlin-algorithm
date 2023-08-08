class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
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
}