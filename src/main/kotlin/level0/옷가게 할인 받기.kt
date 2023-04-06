package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-01-27
 * **/

/** 문제 설명
머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(price: Int) = when {
    price >= 500000 -> price * 0.8
    price >= 300000 -> price * 0.9
    price >= 100000 -> price * 0.95
    else -> price
}.toInt()

fun main() {
    val price = 580000
    val result = 464000

    checkAnswer(solution(price) == result)
}