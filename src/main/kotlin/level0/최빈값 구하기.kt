package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-03-29
 * **/

/** 문제 설명
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다. **/

private fun solution(array: IntArray): Int {
    var answer = 0
    var compare = 0
    var hashMap = HashMap<Int, Int>()
    var list = arrayListOf<Int>()
    for (arr in array) {
        hashMap[arr] = 0
    }
    for (arr in array) {
        hashMap[arr] = hashMap[arr]!! + 1
    }
    for ((key, value) in hashMap) {
        list.add(value)
        if (compare < value) {
            answer = key
            compare = value
        }
    }
    if (list.count { it == compare } > 1) {
        return -1
    }
    return answer
}

fun main() {
    val array = intArrayOf(0, 0, 0, 1, 2, 1, 1, 3, 2)
    val result = -1

    checkAnswer(solution(array) == result)
}