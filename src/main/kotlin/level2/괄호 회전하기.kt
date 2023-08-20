package level2

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-08-20
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(s: String): Int {
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


fun main() {
    val s = "}]()[{"
    val answer = 2

    checkAnswer(solution(s) == answer)
}