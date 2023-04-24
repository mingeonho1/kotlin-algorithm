package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-24
 * **/

/** 문제 설명
새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
단, 금액이 부족하지 않으면 0을 return 하세요. **/

/** 제한 조건
놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수 **/

private fun solution(price: Int, money: Int, count: Int): Long {
    val fee = (price * (1..count).sum().toLong())
    if (money >= fee) return 0L
    return fee - money
}

fun main() {
    val price = 3
    val money = 20
    val count = 4
    val answer: Long = 10

    checkAnswer(solution(price, money, count) == answer)
}