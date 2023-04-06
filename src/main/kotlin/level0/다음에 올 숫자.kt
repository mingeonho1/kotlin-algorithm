package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-04
 * **/

/** 문제 설명
등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(common: IntArray): Int {
    val cha1 = common[1] - common[0]
    val cha2 = common[2] - common[1]

    val last = common.last()

    return if (cha1 == cha2) {
        last + cha1
    } else {
        val be = common[1] / common[0]
        return last * be
    }
}

fun main() {
    val common = intArrayOf(2, 4, 8)
    val result = 16

    checkAnswer(solution(common) == result)
}