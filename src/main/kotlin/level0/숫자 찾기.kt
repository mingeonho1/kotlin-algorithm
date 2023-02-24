package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-24
 * **/

/** 문제 설명
정수 num과 k가 매개변수로 주어질 때,
num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요. **/

private fun solution(num: Int, k: Int): Int {
    for (i in 0 until num.toString().length) {
        if (num.toString()[i].code - 48 == k) {
            return i + 1
        }
    }
    return -1
}

// ★ 두번쨰로 생각한 답 ★
//private fun solution(num: Int, k: Int) =
//    if (num.toString().indexOf(k.toString()) + 1 != 0) num.toString().indexOf(k.toString()) + 1 else -1


fun main() {
    val num = 232443
    val k = 4
    val result = 4

    checkAnswer(solution(num, k) == result)
}