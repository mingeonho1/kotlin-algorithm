package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-24
 * **/

/** 문제 설명
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(n: Int): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in 1..n) {
        if (n % i == 0) {
            answer += i
        }
    }
    return answer
}

//private fun solution(n: Int) = (1..n).filter { n % it == 0 }

fun main() {
    val n = 24
    val result = intArrayOf(1, 2, 3, 4, 6, 8, 12, 24)

    checkAnswer(solution(n).contentEquals(result))
}