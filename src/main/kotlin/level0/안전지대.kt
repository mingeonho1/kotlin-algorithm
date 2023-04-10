package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-10
 * **/

/** 문제 설명
지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(board: Array<IntArray>): Int {
    var answer: Int = 0
    val dx = intArrayOf(0, 0, -1, 1, -1, 1, -1, 1)
    val dy = intArrayOf(-1, 1, 0, 0, -1, -1, 1, 1)

    for (boardX in board.indices) {
        for (boardY in board.indices) {
            var boardElement = board[boardX][boardY]
            if (boardElement == 1) {
                for (i in dx.indices) {
                    try {
                        if (board[boardX + dx[i]][boardY + dy[i]] == 1) {
                            continue
                        }
                        board[boardX + dx[i]][boardY + dy[i]] = 2
                    } catch (e: ArrayIndexOutOfBoundsException) {
                        continue
                    }
                }
            }
        }

    }

    for (boardX in board.indices) {
        answer += board[boardX].count { it == 0 }
    }

    return answer
}

fun main() {
    val board = arrayOf(
        intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 1, 1, 0), intArrayOf(0, 0, 0, 0, 0)
    )
    val result = 13

    checkAnswer(solution(board) == result)
}