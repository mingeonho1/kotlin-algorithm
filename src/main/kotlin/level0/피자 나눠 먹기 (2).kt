package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-23
 * **/

/** 문제 설명
머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요. **/

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

private fun solution(n: Int) = (n * 6 / gcd(n, 6)) / 6


fun main() {
    val n = 10
    val result = 5

    checkAnswer(solution(n) == result)
}