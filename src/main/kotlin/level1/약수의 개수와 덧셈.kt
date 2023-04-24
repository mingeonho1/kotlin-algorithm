package level1

import checkAnswer
import kotlin.math.sqrt

/**
 * © DEV MING 💻
 * Current date: 2023-04-24
 * **/

/** 문제 설명
두 정수 left와 right가 매개변수로 주어집니다.
left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록
solution 함수를 완성해주세요. **/

/** 제한 조건
1 ≤ left ≤ right ≤ 1,000 **/

private fun solution(left: Int, right: Int): Int {
    var answer = 0
    for (n in left..right) {
        var count = 0
        for (i in 1..n) {
            if (n % i == 0) {
                count++
            }
        }
        if (count % 2 == 0) {
            answer += n
        } else {
            answer -= n
        }
    }
    return answer
}

// GPT가 최적화 해준건데 어렵다 ..
fun isPrime(n: Int): Boolean {
    if (n < 2) {
        return false
    }
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun funOptimized(left: Int, right: Int): Int {
    var answer = 0
    for (n in left..right) {
        if (isPrime(n)) {
            if ((n + 1) % 4 == 0) {
                answer += n
            } else {
                answer -= n
            }
        } else {
            if (sqrt(n.toDouble()) % 1 == 0.0) {
                answer -= n
            } else {
                answer += n
            }
        }
    }
    return answer
}

fun main() {
    val left = 24
    val right = 27
    val answer = 52

    checkAnswer(solution(left, right) == answer)
}