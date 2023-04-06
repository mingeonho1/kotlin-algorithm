package level0

import checkAnswer
import kotlin.math.abs

/**
 * © DEV MING 💻
 * Current date: 2023-03-16
 * **/

/** 문제 설명
정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(numList: IntArray, n: Int): IntArray {
    return numList.sortedWith { a, b ->
        if (abs(a - n) == abs(b - n)) b.compareTo(a) else abs(a - n).compareTo(abs(b - n))
    }.toIntArray()
}

fun main() {
    val numList = intArrayOf(10000, 20, 36, 47, 40, 6, 10, 7000)
    val n = 30
    val result = intArrayOf(36, 40, 20, 47, 10, 6, 7000, 10000)

    checkAnswer(solution(numList, n).contentEquals(result))
}