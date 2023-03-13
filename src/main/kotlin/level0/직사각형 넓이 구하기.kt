package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-13
 * **/

/** 문제 설명
2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(dots: Array<IntArray>): Int {
    var list = mutableListOf<Int>()
    for (dot in dots) {
        list += (dot[0] + dot[1])
    }
    val maxIdx = list.indexOf(list.maxOf { it })
    val minIdx = list.indexOf(list.minOf { it })

    return (dots[maxIdx][0] - dots[minIdx][0]) * (dots[maxIdx][1] - dots[minIdx][1])
}

fun main() {
    try {
        val dots = arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2), intArrayOf(1, 2))
        val result = 1

        checkAnswer(solution(dots) == result)
    } catch (e: Exception) {
        println(e)
    }
}
