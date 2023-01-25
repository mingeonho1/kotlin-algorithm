package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-25
 * **/

/** 문제 설명
선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
- 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(sides: IntArray): Int {
    val sortedSides: IntArray = sides.sortedArray()
    return if (sortedSides[0] + sortedSides[1] > sortedSides[2]) 1 else 2
}


fun main() {
    val sides = intArrayOf(199, 72, 222)
    val result = 1

    checkAnswer(solution(sides) == result)
}