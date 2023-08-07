import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val basket = Stack<Int>()
        for (move in moves) {
            for (i in board.indices) {
                val item = board[i][move - 1]
                if (item != 0) {
                    board[i][move - 1] = 0
                    if (basket.isNotEmpty() && basket.peek() == item) {
                        basket.pop()
                        answer += 2
                    } else {
                        basket.push(item)
                    }
                    break
                }
            }
        }
        return answer
    }   
}