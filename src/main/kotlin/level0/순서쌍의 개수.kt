package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-07
 * **/

/** 문제 설명
순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(n: Int): Int {
    var answer: Int = 0
    for (i in 1..n) {
        val a = n / i
        if (i * a == n) {
            answer++
        }
    }
    return answer
}

//private fun solution(n: Int) = (1..n).count { n % it == 0 }

fun main() {
    val n = 20
    val result = 6

    checkAnswer(solution(n) == result)
}