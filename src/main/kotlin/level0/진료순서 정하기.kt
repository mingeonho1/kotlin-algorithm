package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-03
 * **/

/** 문제 설명
외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(emergency: IntArray) = emergency.map { emergency.sortedDescending().indexOf(it) + 1 }.toIntArray()

fun main() {
    val emergency = intArrayOf(30, 10, 23, 6, 100)
    val result = intArrayOf(2, 4, 3, 5, 1)

    checkAnswer(solution(emergency).contentEquals(result))
}