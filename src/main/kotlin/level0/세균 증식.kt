package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-13
 * **/

/** 문제 설명
어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(n: Int, t: Int): Int {
    var answer: Int = n
    for (i in 1..t) {
        answer *= 2
    }
    return answer
}


fun main() {
    val n = 7
    val t = 15
    val result = 229376

    checkAnswer(solution(n, t) == result)
}