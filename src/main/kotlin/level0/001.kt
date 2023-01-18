package level0

/**
 * © DEV MING 💻
 * Current date: 2023-01-17
 * **/

/** 문제 설명
num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요. **/

fun solution(num1: Int, num2: Int): Int {
    return num1 * num2
}


fun main(){
    val num1 = 27
    val num2 = 19
    val result = 513
    if (result == solution(num1, num2)) print("정답입니다 \uD83C\uDF89") else print("다시 도전하세요 \uD83D\uDE80")
}
