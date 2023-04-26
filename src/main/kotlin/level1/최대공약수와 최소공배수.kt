package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-26
 * **/

/** 문제 설명
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다. **/

/** 제한 조건
두 수는 1이상 1000000이하의 자연수입니다. **/

private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

private fun solution(n: Int, m: Int) = intArrayOf(gcd(n, m), (n * m / gcd(n, m)))

fun main() {
    val n = 2
    val m = 5
    val answer = intArrayOf(1, 10)

    checkAnswer(solution(n, m).contentEquals(answer))
}