package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-04-28
 * **/

/** 문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요. **/

/** 제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다. **/

//private fun solution(s: String, n: Int): String {
//    var answer = ""
//    for (str in s) {
//        if (str == ' ') {
//            answer += ' '
//            continue
//        }
//        var ascCode = str.code
//        if (ascCode in 65..90) {
//            ascCode += n
//            if (ascCode > 90) {
//                ascCode -= 26
//                answer += ascCode.toChar()
//            } else {
//                answer += ascCode.toChar()
//            }
//        } else if (ascCode in 97..122) {
//            ascCode += n
//            if (ascCode > 122) {
//                ascCode -= 26
//                answer += ascCode.toChar()
//            } else {
//                answer += ascCode.toChar()
//            }
//        }
//    }
//    return answer
//}

// 가독성도 올라가고 성능개선까지
private fun solution(s: String, n: Int): String {
    val sb = StringBuilder()
    for (ch in s) {
        when (ch) {
            ' ' -> sb.append(' ')
            in 'A'..'Z' -> {
                var shifted = ch + n
                if (shifted > 'Z') shifted -= 26
                sb.append(shifted)
            }

            in 'a'..'z' -> {
                var shifted = ch + n
                if (shifted > 'z') shifted -= 26
                sb.append(shifted)
            }

            else -> sb.append(ch)
        }
    }
    return sb.toString()
}

fun main() {
    val s = "a B z"
    val n = 4
    val answer = "e F d"

    checkAnswer(solution(s, n) == answer)
}