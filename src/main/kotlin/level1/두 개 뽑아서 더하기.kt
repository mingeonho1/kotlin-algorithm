package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-05-02
 * **/

/** 문제 설명
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아
return 하도록 solution 함수를 완성해주세요. **/

/** 제한 조건
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다. **/

private fun solution(numbers: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in 0 until numbers.size - 1) {
        for (n in i + 1 until numbers.size) {
            answer += numbers[i] + numbers[n]
        }
    }
    return answer.distinct().sorted().toIntArray()
}


fun main() {
    val numbers = intArrayOf(2, 1, 3, 4, 1)
    val answer = intArrayOf(2, 3, 4, 5, 6, 7)

    checkAnswer(solution(numbers).contentEquals(answer))
}