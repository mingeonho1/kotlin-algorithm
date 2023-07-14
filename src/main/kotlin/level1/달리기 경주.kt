package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-14
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    val playerList = players.toMutableList()

    for (cal in callings) {
        val index = playerList.indexOf(cal)
        val frontPlayer = playerList[index - 1]
        playerList[index - 1] = cal
        playerList[index] = frontPlayer
    }

    return playerList.toTypedArray()
}

private fun optimizedSolution(players: Array<String>, callings: Array<String>): Array<String> {
    val playerList = players.toMutableList()
    val playerIndices = players.withIndex().associate { it.value to it.index }.toMutableMap()

    for (cal in callings) {
        val index = playerIndices[cal] ?: continue
        if (index > 0) {
            playerList[index] = playerList[index - 1]
            playerList[index - 1] = cal
            playerIndices[cal] = index - 1
            playerIndices[playerList[index]] = index
        }
    }

    return playerList.toTypedArray()
}


fun main() {
    val players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val callings = arrayOf("kai", "kai", "mine", "mine")
    val answer = arrayOf("mumu", "kai", "mine", "soe", "poe")

    checkAnswer(optimizedSolution(players, callings).contentEquals(answer))
}