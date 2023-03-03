package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-03
 * **/

/** 문제 설명
1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요. **/

private fun solution(i: Int, j: Int, k: Int): Int {
    var answer = 0
    for (n in i..j) {
        answer += n.toString().count { it.toString() == k.toString() }
    }
    return answer
}


fun main() {
    val i = 10
    val j = 50
    val k = 5
    val result = 5

    checkAnswer(solution(i, j, k) == result)
}