package level2

import checkAnswer
import java.util.*

/**
 * © DEV MING 💻
 * Current date: 2023-07-23
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(s: String): String {
    // 문자열 s를 공백으로 분리하여 단어의 리스트를 생성합니다.
    return s.split(" ")
        // 각 단어에 대해 다음의 변환 작업을 수행합니다.
        .joinToString(" ") { it ->
            it.replaceFirstChar {
                // 첫 번째 문자가 소문자인 경우, 대문자로 변환합니다.
                // 그렇지 않으면 그대로 둡니다.
                if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
            }
                .lowercase()  // 모든 문자를 소문자로 변환합니다.
                .replaceFirstChar {
                    // 위의 lowercase() 작업으로 모든 문자가 소문자로 변환되었으므로,
                    // 첫 번째 문자를 다시 대문자로 변환합니다.
                    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                }
        }
}

fun main() {
    val s = "3people unFollowed me"
    val answer = "3people Unfollowed Me"

    checkAnswer(solution(s) == answer)
}