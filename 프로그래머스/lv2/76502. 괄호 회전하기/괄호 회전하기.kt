class Solution {
    fun solution(s: String): Int {
        var answer = 0
        var str = s

        fun isValid(s: String): Boolean {
            val stack = mutableListOf<Char>()
            for (c in s) {
                when (c) {
                    '(', '[', '{' -> stack.add(c)
                    ')' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '(') return false
                    ']' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '[') return false
                    '}' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '{') return false
                }
            }
            return stack.isEmpty()
        }

        fun rotateLeft(s: String) = s.substring(1) + s.first()

        for (i in str.indices) {
            if (isValid(str)) answer++
            str = rotateLeft(str)
        }


        return answer
    }
}