package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-02
 * **/

/** 문제 설명
정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.

num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다. **/

private fun solution(numList: IntArray, n: Int) = numList.asList().chunked(n)


fun main() {
    val numList = intArrayOf(100, 95, 2, 4, 5, 6, 18, 33, 948)
    val n = 3
    val result = listOf(listOf(100, 95, 2), listOf(4, 5, 6), listOf(18, 33, 948))

    checkAnswer(solution(numList, n) == result)
}