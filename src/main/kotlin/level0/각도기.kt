package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(angle: Int) = when (angle) {
    in 1..89 -> 1
    90 -> 2
    in 91..179 -> 3
    180 -> 4
    else -> println("값 범위를 넘었습니다 !")
}


fun main() {
    val angle = 179
    val result = 3

    checkAnswer(solution(angle) == result)
}