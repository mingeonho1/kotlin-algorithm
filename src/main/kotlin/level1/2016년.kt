package level1

import checkAnswer
import java.time.MonthDay
import java.time.Year


/**
 * © DEV MING 💻
 * Current date: 2023-05-04
 * **/

/** 문제 설명
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요. **/

/** 제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 **/

//private fun solution(a: Int, b: Int) = when (LocalDate.of(2016, a, b).dayOfWeek.value) {
//    0 -> "SUN"
//    1 -> "MON"
//    2 -> "TUE"
//    3 -> "WED"
//    4 -> "THU"
//    5 -> "FRI"
//    6 -> "SAT"
//    else -> ""
//}

private fun solution(a: Int, b: Int): String {
    val year = 2016
    val date = when (a) {
        2 -> if (Year.of(year).isLeap) MonthDay.of(a, 29) else MonthDay.of(a, b)
        else -> MonthDay.of(a, b)
    }
    return date.atYear(year).dayOfWeek.name.substring(0, 3)
}

fun main() {
    val a = 5
    val b = 24
    val answer = "TUE"

    checkAnswer(solution(a, b) == answer)
}