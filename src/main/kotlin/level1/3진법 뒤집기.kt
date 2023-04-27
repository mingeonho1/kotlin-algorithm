package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-27
 * **/

/** 문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요. **/

/** 제한 조건
n은 1 이상 100,000,000 이하인 자연수입니다. **/

private fun solution(n: Int) = n.toString(3).reversed().toInt(3)


fun main() {
    val n = 45
    val answer = 7

    checkAnswer(solution(n) == answer)
}