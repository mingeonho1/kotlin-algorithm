package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-22
 * **/

/** 문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다. **/

/** 제한 조건
s는 길이가 1 이상, 100이하인 스트링입니다. **/

private fun solution(s: String) =
    if (s.length % 2 == 0) s.substring(s.length / 2 - 1, s.length / 2 + 1) else s[s.length / 2]


fun main() {
    val s = "qwer"
    val answer = "we"
    
    checkAnswer(solution(s) == answer)
}