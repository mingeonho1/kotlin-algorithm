package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-08-13
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(k: Int, tangerine: IntArray): Int {
    var answer = 0
    var sum = 0
    val tangerineMap = hashMapOf<Int, Int>()

    tangerine.forEach {
        tangerineMap[it] = (tangerineMap[it] ?: 0) + 1
    }
    val valueList = tangerineMap.values.sortedDescending()
    valueList.takeWhile {
        sum += it
        answer++
        sum < k
    }

    return answer
}

private fun solution2(k: Int, tangerine: IntArray): Int {
    val valueList = tangerine.groupBy { it }.mapValues { it.value.size }.values.sortedDescending()

    var answer = 0
    var sum = 0

    valueList.takeWhile { sum += it; answer++; sum < k }
    return answer
}

fun solution3(k: Int, tangerine: IntArray) =
    tangerine.groupBy { it }.values.map { it.size }.sortedDescending()
        .runningFold(0) { acc, i -> acc + i }
        .indexOfFirst { it >= k }.takeIf { it != -1 } ?: tangerine.size

fun otherPeopleSolution(k: Int, tangerine: IntArray): Int {
    var answer: Int = 0
    var limit = 0
    tangerine.groupBy { it }.toList().sortedByDescending { it.second.size }.forEach {
        if (limit >= k) {
            return answer
        }
        limit += it.second.size
        answer++
    }

    return answer
}

fun main() {
    val k = 6
    val tangerine = intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)
    val answer = 3

    checkAnswer(solution(k, tangerine) == answer)
}