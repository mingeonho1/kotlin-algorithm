package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-03-06
 * **/

/** 문제 설명
문자열 s가 매개변수로 주어집니다.
s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다. **/

private fun solution(s: String): String {
    var answer = ""
    var hashMap = HashMap<String, Int>()
    val strSet: MutableSet<String> = mutableSetOf()
    for (str in s) {
        hashMap[str.toString()] = 0
        strSet.add(str.toString())
    }
    for (str in s) {
        hashMap.replace(str.toString(), hashMap[str.toString()]?.plus(1) ?: 0)
    }
    for (str in strSet) {
        if (hashMap[str] == 1) {
            answer += str
        }
    }
    return answer.split("").sorted().joinToString("")
}

fun main() {
    val s = "abdc"
    val result = "abcd"
    checkAnswer(solution(s) == result)
}