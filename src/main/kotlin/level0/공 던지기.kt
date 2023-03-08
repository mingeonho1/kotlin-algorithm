package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-08
 * **/

/** 문제 설명
머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요. **/


private fun solution(numbers: IntArray, k: Int): Int {
    var num = 0
    for (i in 1..k) {
        if (i != k) {
            num += 2
            if (num >= numbers.size) {
                num -= numbers.size
            }
        }
    }
    return numbers[num]
}


fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val k = 5
    val result = 3

    checkAnswer(solution(numbers, k) == result)
}