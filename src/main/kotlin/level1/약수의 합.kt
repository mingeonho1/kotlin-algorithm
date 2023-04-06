package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-06
 * **/

/** 문제 설명
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요. **/

private fun solution(n: Int): Int {
    var answer = 0
    for (i in 1..n) {
        if (n % i == 0) {
            answer += i
        }
    }
    return answer
}

//private fun solution(n: Int) = (1..n).filter { n % it == 0 }.sum()

fun main() {
    val n = 12
    val answer = 28
    checkAnswer(solution(n) == answer)
}