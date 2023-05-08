package level1

import checkAnswer
import kotlin.math.sqrt

/**
 * © DEV MING 💻
 * Current date: 2023-05-08
 * **/

/** 문제 설명
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요. **/

/** 제한 조건
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다. **/

private fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) if (n % i == 0) return false
    return true
}

private fun solution(nums: IntArray): Int {
    var answer = 0
    for (i in 0 until nums.size - 2) {
        for (j in i + 1 until nums.size - 1) {
            for (k in j + 1 until nums.size) {
                if (isPrime(nums[i] + nums[j] + nums[k])) answer++
            }
        }
    }
    return answer
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val answer = 1

    checkAnswer(solution(nums) == answer)
}