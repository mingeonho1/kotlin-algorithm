package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-09
 * **/

/** 문제 설명
my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요. **/

private fun solution(myString: String): Int {
    var answer = 0
    val strList = myString.split(" ")
    for (i in strList.indices) {
        if (i == 0) {
            answer = strList[i].toInt()
        } else if (strList[i] == "+") {
            answer += strList[i + 1].toInt()
        } else if (strList[i] == "-") {
            answer -= strList[i + 1].toInt()
        }
        continue
    }
    return answer
}


fun main() {
    val myString = "3 + 4 - 50 + 50"
    val result = 7

    checkAnswer(solution(myString) == result)
}