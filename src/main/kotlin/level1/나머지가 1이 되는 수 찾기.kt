package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-09
 * **/

/** 문제 설명
자연수 n이 매개변수로 주어집니다.
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다. **/

private fun solution(n: Int) = (1..n).filter { n % it == 1 }[0]

//private fun solution(n: Int) = (1..n).first { n % it == 1 }

fun main() {
    val n = 10
    val result = 3
    checkAnswer(solution(n) == result)
}