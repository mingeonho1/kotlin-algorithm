package level0

/**
 * © DEV MING 💻
 * Current date: 2023-04-04
 * **/

/** 문제 설명
연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
두 정수 num과 total이 주어집니다.
연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요. **/

private fun solution(num: Int, total: Int): IntArray {
    var answer: IntArray = intArrayOf()
    val n = num / 2
    val key = total / num

    if (num % 2 == 0) {
        for (i in 1..num) {
            answer += key - n + i
        }
    } else {
        for (i in 1..num) {
            answer += key - n - 1 + i
        }
    }
    return answer
}

//fun solution(num: Int, total: Int): IntArray {
//    val numbers = IntArray(num)
//    val middleIndex = num / 2
//    val key = total / num
//
//    val startingPoint = if (num % 2 == 0) key - middleIndex + 1 else key - middleIndex
//
//    startingPoint.let { startingValue ->
//        numbers.indices.forEach {
//            numbers[it] = startingValue + it
//        }
//    }
//    return numbers
//}

fun main() {
    val num = 5
    val total = 15
    val result = intArrayOf(1, 2, 3, 4, 5)
    checkAnswer(solution(num, total).contentEquals(result))
}