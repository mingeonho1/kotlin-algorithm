package level1

import checkAnswer
import kotlin.math.sqrt

/**
 * © DEV MING 💻
 * Current date: 2023-04-09
 * **/

/** 문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요. **/

private fun solution(n: Long): Long {
    val a = sqrt(n.toFloat())
    return if (a.toString().split(".")[1] == "0") {
        ((a + 1).toLong() * (a + 1).toLong()).toString().split(".")[0].toLong()
    } else {
        -1
    }
}

fun main() {
    val n: Long = 121
    val result: Long = 144
    
    checkAnswer(solution(n) == result)
}