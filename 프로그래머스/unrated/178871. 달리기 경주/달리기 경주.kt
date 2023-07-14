class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
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
}