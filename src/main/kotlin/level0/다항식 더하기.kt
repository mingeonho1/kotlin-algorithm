package level0

/**
 * © DEV MING 💻
 * Current date: 2023-03-28
 * **/

/** 문제 설명
한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
같은 식이라면 가장 짧은 수식을 return 합니다. **/

private fun solution(polynomial: String): String {
    var A = 0
    val x = polynomial.split(" + ").filter { it.contains("x") }.map {
        it.replace("x", "")
    }
    val y = polynomial.split(" + ").filter { it.contains("x").not() }.sumOf { it.toInt() }
    for (a in x) {
        if (a == "") {
            A += 1
            continue
        }
        A += a.toInt()
    }
    when {
        A == 0 -> return "$y"
        A == 1 && y == 0 -> return "x"
        A == 1 -> return "x + $y"
        y == 0 -> return "${A}x"
    }
    return "${A}x + $y"
}

fun main() {
    val polynomial = "3x + 7 + x"
    val result = "4x + 7"

    checkAnswer(solution(polynomial) == result)
}