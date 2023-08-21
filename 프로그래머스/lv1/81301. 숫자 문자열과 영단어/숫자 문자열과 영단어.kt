class Solution {
    fun solution(s: String): Int {
        val wordToNumber = mapOf(
            "zero" to 0,
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4,
            "five" to 5,
            "six" to 6,
            "seven" to 7,
            "eight" to 8,
            "nine" to 9
        )

        var result = ""
        var word = ""

        for (c in s) {
            if (c.isLetter()) {
                word += c
                if (word in wordToNumber.keys) {
                    result += wordToNumber[word]
                    word = ""
                }
            } else {
                result += c
            }
        }

        return result.toInt()
    }
}