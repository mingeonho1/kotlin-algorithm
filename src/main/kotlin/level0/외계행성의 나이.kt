package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-23
 * **/

/** 문제 설명
우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
a는 0, b는 1, c는 2, ..., j는 9입니다.
예를 들어 23살은 cd, 51살은 fb로 표현합니다.
나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(age: Int) = age.toString().map { (it.code + 49).toChar() }.joinToString("")


fun main() {
    val age = 23
    val result = "cd"

    checkAnswer(solution(age) == result)
}