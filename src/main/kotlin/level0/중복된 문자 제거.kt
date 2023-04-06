package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-27
 * **/

/** 문제 설명
문자열 my_string이 매개변수로 주어집니다.
myString에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.**/

private fun solution(myString: String): String {
    val intSet: MutableSet<Char> = mutableSetOf()
    for (str in myString) {
        intSet += str
    }
    return intSet.joinToString("")
}

//private fun solution(myString: String) = myString.toSet().joinToString("")

fun main() {
    val myString = "We are the world"
    val result = "We arthwold"

    checkAnswer(solution(myString) == result)
}