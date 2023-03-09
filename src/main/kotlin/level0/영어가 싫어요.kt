package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-09
 * **/

/** 문제 설명
영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요. **/

private fun solution(numbers: String): Long {
    var answer = ""
    var str = ""
    for (num in numbers) {
        str += num
        when (str) {
            "zero" -> {
                answer += "0"
                str = ""
            }

            "one" -> {
                answer += "1"
                str = ""
            }

            "two" -> {
                answer += "2"
                str = ""
            }

            "three" -> {
                answer += "3"
                str = ""
            }

            "four" -> {
                answer += "4"
                str = ""
            }

            "five" -> {
                answer += "5"
                str = ""
            }

            "six" -> {
                answer += "6"
                str = ""
            }

            "seven" -> {
                answer += "7"
                str = ""
            }

            "eight" -> {
                answer += "8"
                str = ""
            }

            "nine" -> {
                answer += "9"
                str = ""
            }

            else -> continue
        }

    }
    return answer.toLong()
}


fun main() {
    val numbers = "onefourzerosixseven"
    val result: Long = 14067

    checkAnswer(solution(numbers) == result)
}