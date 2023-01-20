package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-20
 * **/

/** 문제 설명
문자열 배열 strList가 매개변수로 주어집니다.
strList 각 원소의 길이를 담은 배열을 return 하도록 solution 함수를 완성해주세요. **/

private fun solution(strList: Array<String>) = strList.map { it.length }.toIntArray()


fun main() {
    val strList = arrayOf("We", "are", "the", "world!")
    val result = intArrayOf(2, 3, 3, 6)
    
    checkAnswer(solution(strList).contentEquals(result))
}