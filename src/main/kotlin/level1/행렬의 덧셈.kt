package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-25
 * **/

/** 문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요. **/

/** 제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다. **/

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer = arrayOf<IntArray>()
    for (i in arr1.indices) {
        var array = intArrayOf()
        for (n in arr1[0].indices) {
            array += arr1[i][n] + arr2[i][n]
        }
        answer += array
    }
    return answer
}

fun main() {
    val arr1 = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))
    val arr2 = arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
    val answer = arrayOf(intArrayOf(4, 6), intArrayOf(7, 9))

    checkAnswer(solution(arr1, arr2).contentDeepEquals(answer))
}