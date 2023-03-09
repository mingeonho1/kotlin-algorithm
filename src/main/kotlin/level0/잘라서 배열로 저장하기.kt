package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-09
 * **/

/** 문제 설명
문자열 my_str과 n이 매개변수로 주어질 때,
my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요. **/

private fun solution(myStr: String, n: Int) = myStr.chunked(n).toTypedArray()


fun main() {
    val myStr = "abc1Addfggg4556b"
    val n = 6
    val result = arrayOf("abc1Ad", "dfggg4", "556b")

    checkAnswer(solution(myStr, n).contentEquals(result))
}