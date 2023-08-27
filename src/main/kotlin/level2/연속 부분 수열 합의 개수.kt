package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-08-27
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(elements: IntArray): Int {
    val n = elements.size
    val extendedElements = IntArray(2 * n)

    for (i in extendedElements.indices) {
        extendedElements[i] = elements[i % n]
    }

    val uniqueSums = mutableSetOf<Int>()

    for (i in 1..elements.size) {
        for (j in 0..elements.size) {
            uniqueSums.add(extendedElements.copyOfRange(j, j + i).sum())
        }
    }

    return uniqueSums.size
}

fun main() {
    val elements = intArrayOf(7, 9, 1, 1, 4)
    val answer = 18

    checkAnswer(solution(elements) == answer)
}