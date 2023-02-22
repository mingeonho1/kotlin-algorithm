package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-22
 * **/

/** 문제 설명
정수 배열 array가 매개변수로 주어질 때,
가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(numbers: IntArray, direction: String): IntArray {
    val n = numbers.size
    val rotated = IntArray(n)
    for (i in 0 until n) {
        val newIndex = when (direction) {
            "right" -> (i + 1) % n
            "left" -> (i - 1 + n) % n
            else -> throw IllegalArgumentException("Invalid direction: $direction")
        }
        rotated[newIndex] = numbers[i]
    }
    return rotated
}


fun main() {
    val numbers = intArrayOf(4, 455, 6, 4, -1, 45, 6)
    val direction = "left"
    val result = intArrayOf(455, 6, 4, -1, 45, 6, 4)

    checkAnswer(solution(numbers, direction).contentEquals(result))
}