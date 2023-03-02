package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-02
 * **/

/** 문제 설명
문자열 before와 after가 매개변수로 주어질 때,
before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(before: String, after: String) = if (before.toList().sorted() == after.toList().sorted()) 1 else 0


fun main() {
    val before = "allpe"
    val after = "apple"
    val result = 0

    checkAnswer(solution(before, after) == result)
}