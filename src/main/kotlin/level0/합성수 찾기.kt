package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-27
 * **/

/** 문제 설명
약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(n: Int): Int {
    var answer: Int = 0
    for (i in 1..n) {
        val count = (1..i).count { i % it == 0 }
        if (count > 2) {
            answer++
        }
    }
    return answer
}

fun main() {
    val n = 10
    val result = 5

    checkAnswer(solution(n) == result)
}