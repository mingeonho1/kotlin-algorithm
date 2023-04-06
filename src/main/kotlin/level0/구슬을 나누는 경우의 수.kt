package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-03-12
 * **/

/** 문제 설명
정수 배열 array와 정수 n이 매개변수로 주어질 때,
array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요. **/

private fun combination(n: Int, r: Int): Int {
    return if (r == 0 || n == r) {
        1
    } else {
        combination(n - 1, r - 1) +
                combination(n - 1, r)
    }
}

private fun solution(balls: Int, share: Int): Int {
    return combination(balls, share)
}


fun main() {
    val balls = 5
    val share = 3
    val result = 10

    checkAnswer(solution(balls, share) == result)
}