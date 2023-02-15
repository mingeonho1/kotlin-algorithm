package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-14
 * **/

/** 문제 설명
문자열 myString이 매개변수로 주어질 때,
myString 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요. **/

private fun solution(myString: String) =
    myString.replace("[^0-9]".toRegex(), "").map { it.digitToInt() }.toIntArray().sortedArray()

fun main() {
    val myString = "hi12392"
    val result = intArrayOf(1, 2, 2, 3, 9)
    checkAnswer(solution(myString).contentEquals(result))
}