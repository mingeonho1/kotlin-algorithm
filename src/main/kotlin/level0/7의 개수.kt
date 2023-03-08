package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-08
 * **/

/** 문제 설명
머쓱이는 행운의 숫자 7을 가장 좋아합니다.
정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요. **/


private fun solution(array: IntArray) = array.map { it.toString().map { it } }.flatten().count { it == '7' }

//private fun solution(array: IntArray) = array.joinToString("").count { it == '7' }
fun main() {
    val array = intArrayOf(7, 77, 17)
    val result = 4

    checkAnswer(solution(array) == result)
}