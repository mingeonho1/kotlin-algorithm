package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-03
 * **/

/** 문제 설명
첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요. **/

//fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

private fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
    val deno = denom1 * denom2 / gcd(denom1, denom2)
    val foun = (numer1 * deno / denom1) + (numer2 * deno / denom2)

    val gcd = gcd(deno, foun)

    val de = deno / gcd
    val fo = foun / gcd

    return intArrayOf(fo, de)
}


fun main() {
    val numer1 = 9
    val denom1 = 2
    val numer2 = 1
    val denom2 = 3
    val result = intArrayOf(29, 6)

    checkAnswer(solution(numer1, denom1, numer2, denom2).contentEquals(result))
}