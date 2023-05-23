package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-05-21
 * **/

/** 문제 설명
머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다.
문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 **/

/** 제한 조건
1 ≤ babbling의 길이 ≤ 100
1 ≤ babbling[i]의 길이 ≤ 30
문자열은 알파벳 소문자로만 이루어져 있습니다.
 **/

private fun solutionX(babbling: Array<String>): Int {
    var answer = 0
    for (ba in babbling) {
        if (ba.replace(Regex("(aya|ye|woo|ma)\\1+"), "").isEmpty()) continue
        if (ba.replace(Regex("aya|ye|woo|ma"), "").isEmpty()) answer++
    }
    // 무엇이 틀렸는지 모르겠다 ..
    return answer
}

private fun solutionO(babbling: Array<String>): Int {
    val sounds = setOf("aya", "ye", "woo", "ma")
    var answer = 0

    for (word in babbling) {
        var index = 0
        var lastSound = ""
        var isCorrect = true

        while (index < word.length) {
            var isMatch = false
            for (sound in sounds) {
                if (index + sound.length <= word.length && word.substring(index, index + sound.length) == sound) {
                    if (lastSound == sound) {
                        isCorrect = false
                        break
                    }
                    lastSound = sound
                    index += sound.length
                    isMatch = true
                    break
                }
            }

            if (!isMatch || !isCorrect) {
                isCorrect = false
                break
            }
        }

        if (isCorrect) answer++
    }

    return answer
}

fun main() {
    val babbling = arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa")
    val answer = 2

    checkAnswer(solutionO(babbling) == answer)
}