package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-07
 * **/

/** 문제 설명
문자열 my_string이 매개변수로 주어집니다.
my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요. **/

fun isNumeric(s: String): Boolean {
    return try {
        s.toDouble()
        true
    } catch (e: NumberFormatException) {
        false
    }
}


private fun solution(myString: String): Int {
    var answer = 0
    var str = ""
    val regex = myString.replace(("[^\\d]").toRegex(), " ").toList()
    for (re in regex) {
        if (isNumeric(re.toString())) {
            str += re.toString()
        } else if (re == ' ') {
            if (str != "") {
                answer += str.toInt()
                str = ""
            }
            continue
        }
    }
    if (str != "") {
        answer += str.toInt()
    }
    return answer
}

//private fun solution(myString: String) =
//    myString.split(("[a-z|A-Z]").toRegex()).filter(String::isNotEmpty).sumOf(String::toInt)

fun main() {
    val myString = "1a2b3c4d123Z1"
    val result = 134

    checkAnswer(solution(myString) == result)
}