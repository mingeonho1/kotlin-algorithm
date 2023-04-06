package level0

import checkAnswer
import kotlin.math.sqrt

/**
 * © DEV MING 💻
 * Current date: 2023-02-10
 * **/

/** 문제 설명
어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(n: Int): Int {
    val num = sqrt(n.toDouble()).toInt()
    return if (n % num == 0) 1 else 2
}

fun main() {
    val n = 144
    val result = 1

    checkAnswer(solution(n) == result)
}