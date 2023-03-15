package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-15
 * **/

/** 문제 설명
영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(score: Array<IntArray>): IntArray {
    var answer = intArrayOf()
    var averageArray = arrayOf<Double>()
    for (sc in score) {
        averageArray += sc.average()
    }
    val sortedList = averageArray.sortedDescending()

    for (item in averageArray) {
        answer += sortedList.indexOf(item) + 1
    }
    return answer
}


fun main() {
    val score =
        arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 1),
            intArrayOf(1, 1),

            )
    val result = intArrayOf(1, 2, 2)

    checkAnswer(solution(score).contentEquals(result))
}