package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-21
 * **/

/** 문제 설명
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(numbers: IntArray): Int {
    var answer = 0
    for (i in numbers.indices) {
        for (r in numbers.indices) {
            if (r > i) {
                var num = numbers[i] * numbers[r]
                if (num > answer) answer = num else continue
            }
        }
    }
    return answer
}

fun main() {
    val numbers = intArrayOf(10, 20, 30, 5, 5, 20, 5)
    val result = 600

    checkAnswer(solution(numbers) == result)
}