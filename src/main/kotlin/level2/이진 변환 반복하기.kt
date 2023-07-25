package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-25
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(s: String): IntArray {
    var transformationCount = 0
    var totalZeroCount = 0
    var binaryString = s

    while (binaryString != "1") {
        val zeroCount = binaryString.count { it == '0' }
        val nonZeroCount = binaryString.length - zeroCount

        totalZeroCount += zeroCount
        binaryString = nonZeroCount.toString(2)

        transformationCount++
    }

    return intArrayOf(transformationCount, totalZeroCount)
}

fun main() {
    val s = "110010101001"
    val answer = intArrayOf(3, 8)

    checkAnswer(solution(s).contentEquals(answer))
}