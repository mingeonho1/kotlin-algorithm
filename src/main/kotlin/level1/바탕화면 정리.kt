package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-10
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(wallpaper: Array<String>): IntArray {
    val xList = mutableListOf<Int>()
    val yList = mutableListOf<Int>()
    for (i in wallpaper.indices) {
        for (n in wallpaper[i].indices) {
            if (wallpaper[i][n] == '#') {
                xList += i
                yList += n
            }
        }
    }
    return intArrayOf(xList.minOf { it }, yList.minOf { it }, xList.maxOf { it } + 1, yList.maxOf { it } + 1)
}


fun main() {
    val wallpaper = arrayOf(".#...", "..#..", "...#.")
    val answer = intArrayOf(0, 1, 3, 4)

    checkAnswer(solution(wallpaper).contentEquals(answer))
}